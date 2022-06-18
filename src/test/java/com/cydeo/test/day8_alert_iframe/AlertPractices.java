package com.cydeo.test.day8_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void confirmAlertTest(){

        //3. Click to “Click for JS Confirm” button
        WebElement JSConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        JSConfirmButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String  expectedText = "You clicked: Ok";
        Assert.assertEquals(actualText,expectedText,"Result Verification Failed");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
