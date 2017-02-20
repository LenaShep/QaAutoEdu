package stackoverflowMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class SignUpPage {
    private WebDriver driver;

    public SignUpPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(xpath = ".//*[@id='openid-buttons']/div/div//..//..//div[contains(@class, 'google') or contains(@class, 'facebook')]")
public WebElement socialButtons;

    public WebElement getSocialButtons(){
        return socialButtons;
    }
}
