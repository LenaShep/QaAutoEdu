package amazonMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class SearchResults {
    private WebDriver driver;

    public SearchResults(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[contains(@class,'a-fixed-left-grid-col') and count(node())=3]//h2")
    public List<WebElement> resultsWithoutAdvertisement;

    public List<WebElement> getResultsWithoutAdvertisement() {
        return resultsWithoutAdvertisement;
    }

    @FindBy(xpath = ".//*[@id='result_0']/div/div[2]/div/div/a/img")
    public WebElement firstProductInTheList;

    public ProductPage goToFirstProductInTheList() {
        firstProductInTheList.click();
        return new ProductPage(driver);
    }

    @FindBy(xpath = ".//li[@id='result_6']//h2")
    public WebElement thirdProductInTheList;

    public ProductPage goTo3ProductInTheList() {
        thirdProductInTheList.click();
        return new ProductPage(driver);
    }


    @FindBy(xpath = ".//li[@id='result_7']//h2")
    public WebElement fifthProductInTheList;

    public ProductPage goTo5ProductInTheList() {
        fifthProductInTheList.click();
        return new ProductPage(driver);
    }

    @FindBy(xpath = ".//li[@id='result_9']//h2")
    public WebElement eightProductInTheList;

    public ProductPage goTo8ProductInTheList() {
        eightProductInTheList.click();
        return new ProductPage(driver);
    }


    @FindBy(xpath = ".//*[@id='s-result-count']")
    public WebElement numberOfResults;

    public int getNumberOfResults() {
        String[] splitCountResult = numberOfResults.getText().split("\\s");
        return Integer.parseInt(splitCountResult[2].replace(",", ""));
    }

    @FindBy(xpath = ".//div[@class ='a-section acs-mn2-content']//a//p[contains(text(), 'Baby Products')]")
    public WebElement babyProducts;

    public BabyProducts goToBabyProducts() {
        babyProducts.click();
        return new BabyProducts(driver);
    }

    @FindBy(xpath = ".//*[h2[contains(@data-attribute, '8 Inch') or contains(@data-attribute, '8-Inch') or contains(@data-attribute, '8 inch')]]")
    public WebElement knife8Inch;

    public ProductPage goToKnifeDetailsPage() {
        knife8Inch.click();
        return new ProductPage(driver);
    }


}

