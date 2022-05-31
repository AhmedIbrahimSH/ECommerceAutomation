package stepdefinitions;

import TestPages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SearchingForAnItem {
    SoftAssert soft = new SoftAssert();
    HomePage home = new HomePage(Hooks.driver);
    @Given("user clicks on search bar")
    public void ClickOnSearch(){
        home.Search.sendKeys("Apple");
        home.Search.sendKeys(Keys.ENTER);
    }
    @Then("Item is searched for")
    public void ItemCheck(){
        // i used here the normal way because of a lot of errors in the using the pages method
        String expected = "https://demo.nopcommerce.com/search?q=Apple";
        String Actual = Hooks.driver.getCurrentUrl();
        soft.assertEquals(Actual , expected , "Failed");
        int size = Hooks.driver.findElements(By.className("product-title")).size();
        System.out.println(size);
        soft.assertTrue(size > 0);
        soft.assertAll();
    }

    @Given("user types the sku")
    public void SearchWithSku(){
        Hooks.driver.findElement(By.id("small-searchterms")).click();
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("AP_MBP_13");
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
    }
    @Then("Item search happens")
    public void SkuItemCheck(){
        String expected = "https://demo.nopcommerce.com/search?q=AP_MBP_13";
        String Actual = Hooks.driver.getCurrentUrl();
        soft.assertEquals(Actual , expected , "Failed");
    }


}
