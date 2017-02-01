package webdrivertest.stackoverflow;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testpack.StartBrowserClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by shepelevich on 1/8/2017.
 */
public class TestStackoverflow {
    private static WebDriver driver;


    @BeforeClass
    public static void setUp() throws Exception {
        driver = StartBrowserClass.startWebDriver("FF");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @Before
    public void setBeforeEachTest() throws Exception {
        driver.get("http://stackoverflow.com/");
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test001() {
        String featured = driver.findElement(By.xpath(".//*[@id='tabs']/a/span")).getText();
        Assert.assertTrue(Integer.parseInt(featured) > 300);
    }


    @Test
    public void test002() {
        WebElement signUp = driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div[1]/span/a[1]"));
        signUp.click();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='openid-buttons']/div/div//..//..//div[contains(@class, 'google') or contains(@class, 'facebook')]")).isDisplayed());

    }


    @Test
    public void test003() {
        WebElement question = driver.findElement(By.xpath(".//*[@id='question-mini-list']/div[4]//h3/a"));
        question.click();
        String date = driver.findElement(By.xpath(".//*[@id='qinfo']/tbody/tr[1]/td[2]/p/b")).getText();
        Assert.assertTrue(date.equals("today"));

    }


   /* @Test
    public void test004() {

    }*/

    @Test
    public void test005() {//check that votes quantity on the Home page is the same as on the Question's details page
        String votesOnHomePage = driver.findElement(By.xpath(".//*[@id='question-mini-list']/div[4]/div/div[1]/div/span")).getText();
        WebElement question = driver.findElement(By.xpath(".//*[@id='question-mini-list']/div[4]//h3/a"));
        question.click();
        String votesOnDetailsPage = driver.findElement(By.xpath(".//*[@id='question']/table/tbody/tr[1]/td[1]/div/span")).getText();
        Assert.assertTrue(votesOnHomePage.equals(votesOnDetailsPage));


    }


    @Test
    public void test006() {//проверить, что количество просмотров на главной странице совпадает с количеством просмотров на страние деталей вопроса
        String viewsOnHomePage = driver.findElement(By.xpath(".//*[@id='question-mini-list']/div[4]/div/div[3]/div/span")).getText();
        int resultOnHomePage = Integer.parseInt(viewsOnHomePage);
        WebElement question = driver.findElement(By.xpath(".//*[@id='question-mini-list']/div[4]//h3/a"));
        question.click();
        String viewsOnDetailsPage = driver.findElement(By.xpath(".//*[@id='qinfo']/tbody/tr[2]/td[2]/p/b")).getText();

    }

}
