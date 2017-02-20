package stackoverflow;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import stackoverflowMapping.SignUpPage;
import stackoverflowMapping.StartPage;
import stackoverflowMapping.TopQuestion;

import java.util.concurrent.TimeUnit;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class TestStackoverflow {
    private static WebDriver driver;
    protected static StartPage startPage;



    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Before
    public void setBeforeEachTest() throws Exception {
        driver.get("http://stackoverflow.com/");
        driver.manage().window().maximize();
        startPage = new StartPage(driver);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

  @Test
  public void test001(){
      Assert.assertTrue(startPage.getFeaturedNumber() > 300);
  }

   @Test
    public void test002() {
        Assert.assertTrue(startPage.goToSignUpPage().getSocialButtons().isDisplayed());
    }

    @Test
    public void test003(){
        Assert.assertTrue(startPage.goToQuestionPage().getDate().equals("today"));

    }
    @Test
    public void test005() {//check that votes quantity on the Home page is the same as on the Question's details page
        Assert.assertTrue(startPage.getVotesOnHomePage()==startPage.goToQuestionPage().getVotesOnQuestionPage());
    }

}
