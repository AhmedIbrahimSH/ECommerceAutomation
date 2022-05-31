package org.example.stepdefinitions;

import TestPages.HomePage;
import TestPages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class ShoppingCart {
    @When("Click on add button")
    public void AddProduct() throws InterruptedException {
        ProductPage pp = new ProductPage(Hooks.driver);
        pp.addtoCartoption.click();
        Thread.sleep(1000);
    }

    @Then("product is added successfully to the user's shopping cart")
    public void AddedTocart(){
        HomePage HP = new HomePage(Hooks.driver);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(HP.NotificationsuccessContent.getText(),"The product has been added successfully");
        soft.assertEquals(HP.Notificationsuccess.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
