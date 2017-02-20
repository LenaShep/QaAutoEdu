package webdrivertest.amazone;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testpack.StartBrowserClass;

import java.util.concurrent.TimeUnit;

import static testpack.StartBrowserClass.startWebDriver;


/**
 * Created by shepelevich on 12/15/2016.
 */
public class TestAmazone {
    private static WebDriver driver;


    @BeforeClass
    public static void setUp() throws Exception {
        driver = StartBrowserClass.startWebDriver("IE");
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
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
        searchButton.click();
        driver.navigate().to("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=duck");
        //Assert.assertTrue(driver.findElement(By.xpath(".//a[contains(@href, 'Duck')or contains(@href, 'duck')]//..//h2")).getText().equals("duck"));
        Assert.assertTrue(driver.findElement(By.xpath(".//div/a/h2")).getText().equalsIgnoreCase("duck"));
    }

    @Test
    public void test002() {
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys("duck");
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
        searchButton.click();
        String countResult = driver.findElement(By.xpath(".//*[@id='s-result-count']")).getText();
        String[] splitCountResult = countResult.split("\\s");
        int result = Integer.parseInt(splitCountResult[2].replace(",", ""));
        WebElement babyProducts = driver.findElement(By.xpath(".//*[@id='result_1']/div/div/div/div/div/a[2]/div[1]/p"));
        babyProducts.click();
        String countNewResult = driver.findElement(By.xpath(".//*[@id='s-result-count']")).getText();
        String[] splitCountNewResult = countNewResult.split("\\s");
        int resultNew = Integer.parseInt(splitCountNewResult[2].replace(",", ""));
        Assert.assertTrue(resultNew < result);
    }


    @Test
    public void test003(){
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys("knife kitchen");
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
        searchButton.click();

        WebElement knife = driver.findElement(By.xpath(".//*[@id='result_1']/div/div/div/div[2]/div[3]/div[1]/a/h2"));
        knife.click();
        WebElement addToCart = driver.findElement(By.xpath(".//*[@id='add-to-cart-button']"));
        addToCart.click();
        
        searchField.sendKeys("duck");
        searchButton.click();
        WebElement firstDuck = driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2"));
        firstDuck.click();
        addToCart.click();

        WebElement cart = driver.findElement(By.xpath(".//*[@id='nav-cart']/span[3]"));
        cart.click();



    }

    @Test
    public void test004(){

    }
}
