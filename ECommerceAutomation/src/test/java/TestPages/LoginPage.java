package TestPages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    WebDriver Mydriver;

    public LoginPage(WebDriver driver){
        this.Mydriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    public WebElement EmailField;

    @FindBy(id = "Password")
    public WebElement passwordField;

    @FindBy(css = "div[class=\"buttons\"] button[type=\"submit\"]")
    public WebElement loginButton;

    public void enterLogin(String email, String password){
        this.EmailField.sendKeys(email);
        this.passwordField.sendKeys(password);
    }
}
