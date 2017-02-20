package stackoverflowMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class TopQuestion {
    private WebDriver driver;

    public TopQuestion (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    @FindBy (xpath = ".//*[@id='qinfo']/tbody/tr[1]/td[2]/p/b")
    public WebElement date;

     public String getDate(){
         return date.getText();
     }

     @FindBy(xpath = ".//*[@id='question']/table/tbody/tr[1]/td[1]/div/span")
    public WebElement votesOnQuestionPage;

    public int getVotesOnQuestionPage(){
        return Integer.parseInt(votesOnQuestionPage.getText());
    }
}
