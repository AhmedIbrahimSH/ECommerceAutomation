package stepdefinitions;

import TestPages.HomePage;
import TestPages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class AddToWishList {
    ProductPage pp = new ProductPage(Hooks.driver);
    HomePage hp = new HomePage(Hooks.driver);
    @Given("user clicks on product")
    public void clickonite(){
        Hooks.driver.findElement(By.linkText("Build your own computer")).click();
    }

    @And("user click on add to wishlist")
    public void addtolist(){
        Select selector = new Select(Hooks.driver.findElement(By.id("product_attribute_2")));
        selector.selectByVisibleText("2 GB");
        Hooks.driver.findElement(By.id("add-to-wishlist-button-1")).click();

        pp.addtoCartoption.click();

    }

    @Then("product added")
    public void productadded(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(hp.NotificationsuccessContent.getText(),"The product has been added to your wishlist");
        soft.assertEquals(hp.Notificationsuccess.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
