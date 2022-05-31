package org.example.stepdefinitions;

import TestPages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    ArrayList<String> Tabs;
    HomePage home = new HomePage(Hooks.driver);

    @Given("user clicks on facebook icon")
    public void openFacebookpage(){
        home.Facebook.click();
    }


    @Then("user is navigated to the facebook page")
    public void FacebookCheck() throws InterruptedException {
       windowHandler("https://www.facebook.com/nopCommerce");
    }


    @Given("user clicks on twitter icon")
    public void openTwitterpage(){
        home.Twitter.click();
    }


    @Then("user is navigated to the twitter page")
    public void twitterCheck() throws InterruptedException {
        windowHandler("https://twitter.com/nopCommerce");
    }

    @Given("user clicks on rss icon")
    public void openrsspage(){
        home.RSS.click();
    }


    @Then("user is navigated to the rss page")
    public void rssCheck() throws InterruptedException {
        Thread.sleep(2000);
        Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals( Hooks.driver.getCurrentUrl() , "https://demo.nopcommerce.com/new-online-store-is-open");

// that's because we need to only close tab 1
        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        Hooks.driver.quit();
    }


    @Given("user clicks on youtube icon")
    public void openyoutubepage(){
        home.Youtube.click();
    }


    @Then("user is navigated to the youtube page")
    public void youtubeCheck() throws InterruptedException {
        windowHandler("https://www.youtube.com/user/nopCommerce");
    }

    public void windowHandler(String expected) throws InterruptedException {

        Thread.sleep(2000);
        Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), expected);

// that's because we need to only close tab 1
        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

        Hooks.driver.quit();
// that's because we need to close the whole browser after finishing all the steps as we used to do before

    }
}
