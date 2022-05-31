package org.example.TestPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver Mydriver;

    public HomePage(WebDriver driver){
        this.Mydriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement Register;

    @FindBy(className = "ico-login")
    public WebElement Login;

    @FindBy(className = "ico-account")
    public WebElement MyAccount;
    @FindBy(id = "small-searchterms")
    public WebElement SearchForName;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement SearchButton;

    @FindBy(id = "q")
    public WebElement Search;

    @FindBy(id = "customerCurrency")
    public WebElement Currency;

    @FindBy(xpath = "//div[@class=\"prices\"] //span")
    public WebElement CurrencyOfProduct;

    @FindBy(xpath = "//div [@class=\"header-menu\"]  //ul[@class]")

    public WebElement MenuOfHeader;


    @FindBy(xpath = "//a[@href=\"/software\"]")
    public WebElement SoftwareList;

    @FindBy(xpath = "//a[@href=\"/computers\"]")
    public WebElement ComputersMenu;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    public WebElement IphonePhone;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")
    public WebElement IPhonecontroller;


    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement NokiaPhoto;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")
    public WebElement Nokiacontroller;


    @FindBy(xpath = "//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]")
    public WebElement MacbookPicture;

    @FindBy(linkText = "Facebook")
    public WebElement Facebook;

    @FindBy(linkText = "Twitter")
    public WebElement Twitter;

    @FindBy(linkText = "RSS")
    public WebElement RSS;

    @FindBy(linkText = "YouTube")
    public WebElement Youtube;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//div")
    public WebElement Notificationsuccess;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//p")
    public WebElement NotificationsuccessContent;
}
