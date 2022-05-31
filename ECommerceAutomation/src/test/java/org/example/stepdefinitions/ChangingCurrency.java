package org.example.stepdefinitions;

import TestPages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ChangingCurrency {


    HomePage home = new HomePage(Hooks.driver);
    @Given("user clicks to change the sign")
    public void ClickOnCurrencyDrop(){
        Hooks.driver.findElement(By.id("customerCurrency")).click();
    }
    @And("user changes currency")
    public void ChangeCurrency(){
        Select Currency_Selector = new Select(Hooks.driver.findElement(By.name("customerCurrency")));
        Currency_Selector.selectByVisibleText("Euro");
//        Hooks.driver.findElement(By.id("small-searchterms")).click();
//        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Nokia");

    }
    @Then("currency changed")
    public void isChanged(){
        String expected = "€1032.00";
        String actual = Hooks.driver.findElement(By.linkText("€1032.00")).getText();
        Assert.assertEquals(actual , expected , "done ");

    }

}
