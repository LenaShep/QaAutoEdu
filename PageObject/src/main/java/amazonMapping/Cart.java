package amazonMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shepelevich on 2/8/2017.
 */
public class Cart {
    private WebDriver driver;

    public Cart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='nav-cart-count']")
    public WebElement numberOfProductsInTheCart;

    public int getNumberOfProductsInTheCart(){
        return Integer.parseInt(numberOfProductsInTheCart.getText());
    }

    @FindBy(xpath = ".//*[@id='activeCartViewForm']/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
    public WebElement product1Title;

    public String getProduct1TitleInTheCart(){
        return product1Title.getText();
    }

    @FindBy(xpath = ".//*[@id='activeCartViewForm']/div[2]/div[1]/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
    public WebElement product2Title;

    public String getProduct2TitleInTheCart(){
        return product2Title.getText();
    }

    @FindBy(xpath = ".//*[@id='activeCartViewForm']/div[2]/div[1]/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
    public WebElement product3Title;

    public String getProduct3TitleInTheCart(){
        return product3Title.getText();
    }

    @FindBy(xpath = ".//*[@id='activeCartViewForm']/div/div[2]/div/div/div/p/span")
    public WebElement product1Price;

    public Double getProduct1Price(){
        return Double.parseDouble(product1Price.getText().replace("$", ""));
    }

    @FindBy(xpath = ".//*[@id='activeCartViewForm']/div/div[1]/div/div/div/p/span")
    public WebElement product2Price;

    public Double getProduct2Price(){
        return Double.parseDouble(product2Price.getText().replace("$", ""));
    }

    @FindBy(xpath = ".//*[@id='activeCartViewForm']/div/p/span/span/span")
    public WebElement totalSum;

    public Double getTotalSum(){
        return Double.parseDouble(totalSum.getText().replace("$", ""));
    }






}
