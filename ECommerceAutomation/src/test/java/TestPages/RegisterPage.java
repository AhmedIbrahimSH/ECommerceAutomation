package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver Mydriver;
    public RegisterPage(WebDriver driver){
        this.Mydriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "// input[@type=\"radio\"]")
    public WebElement genderbutton;

    @FindBy(id = "FirstName")
    public WebElement firstNamefield;

    @FindBy(id = "LastName")
    public WebElement lastNamefield;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]  //option [@value=\"20\"]")
    public WebElement Dateofbirthday;

    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]  //option [@value=\"2\"]")
    public WebElement DateofbirthMonth;

    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]  //option [@value=\"2000\"]")
    public WebElement DateofbirthYear;

    @FindBy(id = "Email")
    public WebElement Newemail;

    @FindBy(id = "Company")
    public WebElement Newcompany;

    @FindBy(id = "Password")
    public WebElement Newpassword;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmNewPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className = "result")
    public WebElement registrationCompletemessage;

    @FindBy(xpath = "//div [@class=\"buttons\"] //a[@href=\"/\"]")
    public WebElement continueButton;
}
