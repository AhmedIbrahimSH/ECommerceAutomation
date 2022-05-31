package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver Mydriver;

    public ProductPage(WebDriver driver){
        this.Mydriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-wishlist-button-4")
    public WebElement wishList;
    @FindBy(id = "add-to-cart-button-1")
    public WebElement addtoCartoption;

}
