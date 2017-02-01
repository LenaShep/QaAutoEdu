package webdrivertest.amazone;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.DoubleClickAction;
import testpack.StartBrowserClass;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static testpack.StartBrowserClass.startWebDriver;


/**
 * Created by shepelevich on 12/15/2016.
 */
public class TestAmazone {
    private static WebDriver driver;


    @BeforeClass
    public static void setUp() throws Exception {
        driver = StartBrowserClass.startWebDriver("FF");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @Before
    public void setBeforeEachTest() throws Exception {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test001() {
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys("duck");
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div/div/input[contains(@type, 'submit')]"));
        searchButton.click();
        List<WebElement> resultList = driver.findElements(By.xpath(".//div[@class='a-fixed-left-grid-col a-col-right' AND not(h5)]//h2"));
        for (WebElement element : resultList) {
            String result = element.getText().toLowerCase();
            Assert.assertTrue(result.contains("duck"));
        }
    }

    @Test
    public void test002() {
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys("duck");
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div/div/input[contains(@type, 'submit')]"));
        searchButton.click();
        String countResult = driver.findElement(By.xpath(".//*[@id='s-result-count']")).getText();
        String[] splitCountResult = countResult.split("\\s");
        int result = Integer.parseInt(splitCountResult[2].replace(",", ""));
        WebElement babyProducts = driver.findElement(By.xpath(".//div[@class ='a-section acs-mn2-content']//a//p[contains(text(), 'Baby Products')]"));
        babyProducts.click();
        String countNewResult = driver.findElement(By.xpath(".//*[@id='s-result-count']")).getText();
        String[] splitCountNewResult = countNewResult.split("\\s");
        int resultNew = Integer.parseInt(splitCountNewResult[2].replace(",", ""));
        Assert.assertTrue(resultNew < result);
    }


    @Test
    public void test003() {
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys("knife kitchen");
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div/div/input[contains(@type, 'submit')]"));
        searchButton.click();
        driver.findElement(By.xpath(".//*[h2[contains(@data-attribute, '8 Inch') or contains(@data-attribute, '8-Inch') or contains(@data-attribute, '8 inch')]]")).click();
        String titleKnife = driver.findElement(By.xpath(".//*[@id='productTitle']")).getText();
        String priceKnife = driver.findElement(By.xpath(".//*[@id='priceblock_ourprice']|//*[@id='priceblock_saleprice']")).getText();
        double resultPriceKnife = Double.parseDouble(priceKnife.replace("$", ""));
        driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
        WebElement searchField2 = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField2.sendKeys("duck");
        WebElement searchButton2 = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div/div/input[contains(@type, 'submit')]"));
        searchButton2.click();
        driver.findElement(By.xpath(".//*[@id='s-results-list-atf']/li/div/div/div/a/h2")).click();
        String titleDuck = driver.findElement(By.xpath(".//*[@id='productTitle']")).getText();
        String priceDuck = driver.findElement(By.xpath(".//*[@id='priceblock_ourprice']|//*[@id='priceblock_saleprice']")).getText();
        double resultPriceDuck = Double.parseDouble(priceDuck.replace("$", ""));
        driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath(".//*[@id='nav-cart-count']")).click();
        String sum = driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[3]/p/span/span/span")).getText();
        double resultSum = Double.parseDouble(sum.replace("$", ""));
        String product1 = ".//*[@id='activeCartViewForm']//a[@class='a-link-normal sc-product-link']//span[contains(text(), '" + titleKnife + "')]";
        String product2 = ".//*[@id='activeCartViewForm']//a[@class='a-link-normal sc-product-link']//span[contains(text(), '" + titleDuck + "')]";
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='nav-cart-count']")).getText().equals("2"));
        Assert.assertTrue(priceKnife.equals(driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div/div[2]/div/div/div/p/span")).getText()));
        Assert.assertTrue(priceDuck.equals(driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div/div[1]/div/div/div/p/span")).getText()));
        Assert.assertEquals(resultSum, resultPriceDuck + resultPriceKnife, 0.0001);
        Assert.assertTrue(driver.findElement(By.xpath(product1)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(product2)).isDisplayed());
    }

    @Test
    public void test004() {
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys("phone");
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
        searchButton.click();
        driver.findElement(By.xpath(".//*[@id='result_6']/div/div/div/div[2]/div[2]/div[1]/a/h2")).click();
        WebElement addToCart = driver.findElement(By.xpath(".//*[input[contains(@id, 'add-to-cart-button')]]"));
        String product1 = driver.findElement(By.xpath(".//*[@id='productTitle']")).getText();
        driver.findElement(By.xpath(".//*[input[contains(@id, 'add-to-cart-button')]]")).click();
        driver.navigate().to("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=phone");
        driver.findElement(By.xpath(".//*[@id='result_8']/div/div/div/div[2]/div[2]/div[1]/a/h2")).click();
        String product2 = driver.findElement(By.xpath(".//*[@id='productTitle']")).getText();
        driver.findElement(By.xpath(".//*[input[contains(@id, 'add-to-cart-button')]]")).click();
        driver.navigate().to("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=phone");
        driver.findElement(By.xpath(".//*[@id='result_9']/div/div/div/div[2]/div[2]/div[1]/a/h2")).click();
        String product3 = driver.findElement(By.xpath(".//*[@id='productTitle']")).getText();
        driver.findElement(By.xpath(".//*[input[contains(@id, 'add-to-cart-button')]]")).click();
        driver.findElement(By.xpath(".//*[@id='siNoCoverage-announce']")).click();
        driver.findElement(By.xpath(".//*[@id='hlb-view-cart-announce']")).click();
        driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
        String pathProduct1 = ".//*[@id='activeCartViewForm']//a[@class='a-link-normal sc-product-link']//span[contains(text(), '" + product1 + "')]";
        String pathProduct2 = ".//*[@id='activeCartViewForm']//a[@class='a-link-normal sc-product-link']//span[contains(text(), '" + product2 + "')]";
        String pathProduct3 = ".//*[@id='activeCartViewForm']//a[@class='a-link-normal sc-product-link']//span[contains(text(), '" + product3 + "')]";
        Assert.assertTrue(driver.findElement(By.xpath(pathProduct1)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(pathProduct2)).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath(pathProduct3)).isDisplayed());

    }

    @Test
    public void test005() {//check that Price for product in Deal of the day block is the same as on the Product's details page
        String priceOnHomePage = driver.findElement(By.xpath(".//*[@id='dotd-info']/div/div/div/div/span/span[contains(@class, 'a-color-price')]")).getText();
        driver.findElement(By.xpath(".//*[@id='dotd-image']/div/div/a/img")).click();
        String priceOnProductPage = driver.findElement(By.xpath(".//*[@id='priceblock_dealprice']")).getText();
        Assert.assertTrue(priceOnHomePage.equals(priceOnProductPage));

    }
}
