package org.example.stepdefinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @Before
    public static void openbrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\metr\\Desktop\\AHMED COURSES WORK  FOLDER\\udacity testing\\maven\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

  //  @After
    public void closebrowser(){
        driver.quit();
    }
}
