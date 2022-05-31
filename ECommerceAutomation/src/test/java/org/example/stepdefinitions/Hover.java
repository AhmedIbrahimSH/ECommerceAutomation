package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Hover {
    String subCategory;
    @When("click on random sub-category if it exists")
    public void HoverCateogry() throws InterruptedException {
        Actions act = new Actions(Hooks.driver);
// hover on "Computers"
        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        act.moveToElement(computers).perform();
        Thread.sleep(1000);

// getText() of subCategory before click on it
        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategory = desktops.getText().toLowerCase().trim();		// this will change "Desktops " to "desktops"
        System.out.println(subCategory);

// click on "Desktops"
        desktops.click();

    }
    @Then("sub-category page opened")
    public void CategoryCheck(){
        String Actual = Hooks.driver.findElement(By.className("page-title")).getText().toLowerCase();
        Assert.assertEquals(Actual , subCategory , "Item exists");
    }

}
