package stepdefinitions;

import TestPages.HomePage;
import TestPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import TestPages.HomePage;
import org.testng.asserts.SoftAssert;

public class Login {

    HomePage home = new HomePage(Hooks.driver);
    LoginPage login = new LoginPage(Hooks.driver);
    @Given("user clicks on login")
    public void ClickOnLogin() {
        home.Login.click();
    }

    @And("user enter his details")
    public void UserLogin(){
        login.EmailField.sendKeys("ahmed@gmail.com");
        login.passwordField.sendKeys("0123456789");
        login.loginButton.click();
    }

    @Then("User enters his account")
    public void CheckLoginDetails(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        soft.assertTrue(home.MyAccount.isDisplayed());
        soft.assertAll();
    }
}
