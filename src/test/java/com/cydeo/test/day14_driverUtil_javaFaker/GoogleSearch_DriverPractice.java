package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {

    @Test
    public void google_search_driver_practice(){

        WebDriver driver = Driver.getDriver();
        System.out.println(((RemoteWebDriver) driver).getSessionId());

        // Go to "https://www.google.com/"
        driver.get(ConfigurationReader.getProperty("google"));
        System.out.println(((RemoteWebDriver) driver).getSessionId());

        // Write “apple” in search box
        WebElement searchBox = driver.findElement(By.name("q"));
        System.out.println(((RemoteWebDriver) driver).getSessionId());
        searchBox.sendKeys("apple" + Keys.ENTER);

        // Verify title:
        //Expected: apple - Google Search
        String actualTitle = driver.getTitle();
        System.out.println(((RemoteWebDriver) driver).getSessionId());
        String expectedTitle = "apple - Google Search";

        Assert.assertEquals(actualTitle,expectedTitle,"Title Verification Failed!");
    }
}
