package stepdefinitions;

import TestPages.HomePage;
import TestPages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Register {
    RegisterPage rp = new RegisterPage(Hooks.driver);
    HomePage hp = new HomePage(Hooks.driver);

    @Given("user clicks on register")
    public void register() {
        hp.Register.click();
    }
    @And("user puts his info")
        public void EnterInfo() {
            rp.genderbutton.click();
            rp.firstNamefield.sendKeys("Ahmed Mostafa");
            rp.lastNamefield.sendKeys("Ismaiel");
            Select Date_selector = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
            Date_selector.selectByValue("15");
            Select month_selector = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
            month_selector.selectByVisibleText("July");
            Select Year_Selector = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
            Year_Selector.selectByValue("2009");
            rp.Newemail.sendKeys("ahmed@gmail.com");
            rp.Newcompany.sendKeys("Adidas Company");
            rp.Newpassword.sendKeys("0123456789");
            rp.confirmNewPassword.sendKeys("0123456789");
            rp.registerButton.click();
    }

    @Then("registration completed")
    public void CheckRegComplete(){
        String ExpectedResult = "Your registration completed";
        Assert.assertEquals(rp.registrationCompletemessage.getText() , ExpectedResult , "Success");
    }



}
