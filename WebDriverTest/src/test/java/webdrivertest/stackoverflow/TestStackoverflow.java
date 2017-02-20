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
        driver = StartBrowserClass.startWebDriver("IE");
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
    public void test001(){
        String featured = driver.findElement(By.xpath(".//*[@id='tabs']/a[2]/span")).getText();
        Assert.assertTrue(Integer.parseInt(featured) > 300);
    }

    @Test
    public void test002(){
        WebElement signUp = driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div[1]/span/a[1]"));
        signUp.click();
       // driver.navigate().to("https://stackoverflow.com/users/signup?ssrc=head&returnurl=%2fusers%2fstory%2fcurrent&utm_source=stackoverflow.com&utm_medium=dev-story&utm_campaign=signup-redirect");
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='openid-buttons']/div/div//..//..//div[contains(@class, 'google') or contains(@class, 'facebook')]")).isDisplayed());

    }
    @Test
    public void testSignUpPage()throws Exception{
        driver.findElement(By.xpath(".//div[@class='topbar']//div[@class='topbar-links']//a[contains(text(),'sign up')]")).click();
        Assert.assertTrue("Google button is not displayed on SignUp page",
                !driver.findElements(By.xpath(".//*[@id='openid-buttons']/div/div[@class='text']/span[text()='Google']")).isEmpty()&&
                        driver.findElement(By.xpath(".//*[@id='openid-buttons']/div/div[@class='text']/span[text()='Google']")).isDisplayed());

        Assert.assertTrue("Facebook button is not displayed on SignUp page",
                !driver.findElements(By.xpath(".//*[@id='openid-buttons']/div/div[@class='text']/span[text()='Facebook']")).isEmpty()&&
                        driver.findElement(By.xpath(".//*[@id='openid-buttons']/div/div[@class='text']/span[text()='Facebook']")).isDisplayed());

    }

    @Test
    public void test003(){
        WebElement question = driver.findElement(By.xpath(".//*[@id='question-summary-41533697']/div[2]/h3/a"));
        question.click();
        //  driver.navigate().to("http://stackoverflow.com/questions/41533697/creating-a-dataframe-using-the-values-in-another-dataframe-r");
        WebElement date = driver.findElement(By.xpath(".//*[@id='qinfo']/tbody/tr[1]/td[2]/p/b"));
        System.out.print (date);
        // Assert.assertTrue(date=="today");
    }

    @Test
    public void test0031(){
        WebElement question = driver.findElement(By.xpath(".//*[@id='question-summary-41545278']/div[2]/h3/a"));
        question.click();
        driver.navigate().to("http://stackoverflow.com/questions/41545278/how-to-get-unity-showing-reward-video-price-or-reward-amount");
        WebElement date = driver.findElement(By.xpath(".//*[@id='qinfo']/tbody/tr[1]/td[2]/p/b"));
        System.out.print (date);
        // Assert.assertTrue(date=="today");
    }

    @Test
    public void test004(){

    }

    @Test
    public void test005(){

    }
}
