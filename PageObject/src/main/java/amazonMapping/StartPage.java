package amazonMapping;

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

    @FindBy(xpath = ".//*[@id='twotabsearchtextbox']")
    public WebElement searchField;

    public void searchField(String search){
        searchField.sendKeys(search);
    }

    @FindBy(xpath = ".//*[@id='nav-search']/form/div/div/input[contains(@type, 'submit')]")
    public  WebElement searchButton;

    public SearchResults getSearchResults() {
        searchButton.click();
        return new SearchResults(driver);
    }

    @FindBy(xpath = ".//span[contains(@class, 'a-color-price')]")
    public WebElement priceOnHomePage;

    public String getPriceOnHomePage(){
        return priceOnHomePage.getText();
    }

    @FindBy(xpath = ".//*[@id='dotd-image']//a")
    public WebElement dealProduct;

    public ProductPage goToDealProductPage(){
        dealProduct.click();
        return new ProductPage(driver);

    }

    @FindBy(xpath = ".//*[@id='nav-cart']")
    public WebElement cart;

    public Cart goToCart(){
        cart.click();
        return new Cart(driver);
    }




}
