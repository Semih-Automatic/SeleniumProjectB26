package com.cydeo.test.day8_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDateDropdown {

    //TC : Selecting date on dropdown and verifying
    //1. Open Chrome browser

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //TC #1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dateDropdown() {
        //3. Select “December 1st, 1923” and verify it is selected.
        Select year = new Select(driver.findElement(By.id("year")));
        Select month = new Select(driver.findElement(By.id("month")));
        Select day = new Select(driver.findElement(By.id("day")));
        // Select year using   : visible text
        year.selectByVisibleText("1923");

        //Select month using    : value attribute Select
        month.selectByValue("11");

        //day using : index number
        day.selectByIndex(0);

        String actualYear = year.getFirstSelectedOption().getText();
        String expectedYear = "1923";
        Assert.assertEquals(actualYear, expectedYear, "Wrong Year Selected!");
        //Assert.assertTrue(actualYear.equals(expectedYear)); THIS IS ANOTHER WAY TO WRITE IT CHECKS IF ITS TRUE OR FALSE

        //How would we print all the options?
        for (WebElement eachYear : year.getOptions()){
            System.out.println(eachYear.getText());
        }

        String actualMonth = month.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedMonth, "Wrong Month Selected!");

        String actualDay = day.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay, "Wrong Day Selected!");


    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
