package stackoverflowMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(xpath = ".//*[@id='tell-me-more']")
    public WebElement signUp;

    public SignUpPage goToSignUpPage(){
        signUp.click();
        return new SignUpPage(driver);
    }

    @FindBy(xpath = ".//*[@id='question-mini-list']/div[4]//h3/a")
    public WebElement question;

    public TopQuestion goToQuestionPage(){
        question.click();
        return new TopQuestion(driver);
    }

    @FindBy(xpath = ".//*[@id='tabs']/a/span")
    public  WebElement featured;

    public int getFeaturedNumber(){
      return Integer.parseInt(featured.getText());
    }

    @FindBy(xpath = ".//*[@id='question-mini-list']/div[4]/div/div[1]/div/span")
    public WebElement votesOnHomePage;

    public int getVotesOnHomePage(){
        return Integer.parseInt(votesOnHomePage.getText());
    }

}
