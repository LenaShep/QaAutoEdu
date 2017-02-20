package amazon;

import amazonMapping.ProductPage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import amazonMapping.StartPage;

import java.beans.DefaultPersistenceDelegate;
import java.util.concurrent.TimeUnit;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class TestAmazon {
    private static WebDriver driver;
    protected static StartPage startPage;


    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
        //   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Before
    public void setBeforeEachTest() throws Exception {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        startPage = new StartPage(driver);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test001() {
        startPage.searchField("duck");
        for (WebElement element : startPage.getSearchResults().getResultsWithoutAdvertisement()) {
            String result = element.getText().toLowerCase();
            Assert.assertTrue(result.contains("duck"));
        }
    }

    @Test
    public void test002() {
        startPage.searchField("duck");
        int result = startPage.getSearchResults().getNumberOfResults();
        int newResult = startPage.getSearchResults().goToBabyProducts().getNumberOfResults();
        Assert.assertTrue(newResult < result);
    }

    @Test
    public void test003() {
        startPage.searchField("knife kitchen");
        ProductPage knife = startPage.getSearchResults().goToKnifeDetailsPage();
        Double knifePriceOnProductPage = knife.getProductPrice();
        String knifeTitleOnProductPage = knife.getProductTitle();
        knife.addToCart();
        startPage.searchField("duck");
        ProductPage duck = startPage.getSearchResults().goToFirstProductInTheList();
        Double duckPriceOnProductPage = duck.getProductPrice();
        String duckTitleOnProductPage = duck.getProductTitle();
        duck.addToCart();
        Assert.assertTrue(startPage.goToCart().getNumberOfProductsInTheCart() == 2);
        Assert.assertTrue(startPage.goToCart().getTotalSum() == knifePriceOnProductPage + duckPriceOnProductPage);
        Assert.assertEquals(startPage.goToCart().getProduct1Price(), knifePriceOnProductPage, 0.00001);
        Assert.assertEquals(startPage.goToCart().getProduct2Price(), duckPriceOnProductPage, 0.00001);
        Assert.assertTrue(startPage.goToCart().getProduct1TitleInTheCart().equals(knifeTitleOnProductPage));
        Assert.assertTrue(startPage.goToCart().getProduct2TitleInTheCart().equals(duckTitleOnProductPage));

    }

    @Test//НЕ ЗАКОНЧИЛА ЭТОТ ТЕСТ, ОН НЕ РАБОТАЕТ
    public void test004() {
        startPage.searchField("phone");
        ProductPage product1 = startPage.getSearchResults().goTo3ProductInTheList();
        String product1Title = product1.getProductTitle();
        product1.addToCart();
       product1.skipAdv();
        startPage.searchField("phone");
        ProductPage product2 = startPage.getSearchResults().goTo5ProductInTheList();
        String product2Title = product2.getProductTitle();
        product2.addToCart();
        product2.skipAdv();
        startPage.searchField("phone");
        ProductPage product3=startPage.getSearchResults().goTo8ProductInTheList();
        String product3Title = product3.getProductTitle();
        product3.addToCart();
       // product3.skipAdv();
        Assert.assertTrue(startPage.goToCart().getProduct1TitleInTheCart().equals(product1Title));
        Assert.assertTrue(startPage.goToCart().getProduct2TitleInTheCart().equals(product2Title));
        Assert.assertTrue(startPage.goToCart().getProduct3TitleInTheCart().equals(product3Title));

    }

    @Test
    public void test005() {
        Assert.assertTrue(startPage.getPriceOnHomePage().equals(startPage.goToDealProductPage().getPriceOnDealProductPage()));
    }
}
