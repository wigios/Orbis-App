package com.choucair.app;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.seleniumsimplified.com");
        Assert.assertTrue("Title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
    }
}