package amazonMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shepelevich on 2/7/2017.
 */
public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = ".//*[@id='priceblock_dealprice']")
    public WebElement priceOnDealProductPage;

    public String getPriceOnDealProductPage(){
        return priceOnDealProductPage.getText();
    }

    @FindBy(xpath = ".//*[@id='productTitle']")
    public WebElement productTitle;

    public String getProductTitle(){
        return productTitle.getText();
    }

    @FindBy(xpath = ".//*[@id='priceblock_ourprice']|//*[@id='priceblock_saleprice']")
    public WebElement productPrice;

    public Double getProductPrice(){
       return Double.parseDouble(productPrice.getText().replace("$", ""));
    }

    @FindBy(xpath = ".//*[@id='add-to-cart-button']")
    public WebElement addToCart;

    public void addToCart(){
        addToCart.click();
    }

    @FindBy(xpath = ".//*[@id='siNoCoverage']//span")
    public WebElement adv;
    public void skipAdv(){
        if(adv.isDisplayed()) {
            adv.click();
        }
    }

}
