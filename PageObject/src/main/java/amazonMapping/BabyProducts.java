package amazonMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class BabyProducts {
    private WebDriver driver;

    public BabyProducts (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = ".//*[@id='s-result-count']")
    public WebElement numberOfResults;

    public int getNumberOfResults(){
        String[] splitCountResult = numberOfResults.getText().split("\\s");
        return Integer.parseInt(splitCountResult[2].replace(",", ""));
    }

}
