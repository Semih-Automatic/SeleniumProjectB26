package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Simple_DropDown {
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

    @AfterMethod
    public void breakDownMethod() {
        driver.quit();
    }

    @Test
    public void simpleDropdown() {

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualDefaultSimpleDropdown = dropdown.getFirstSelectedOption().getText();
        String expectedDefaultSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualDefaultSimpleDropdown, expectedDefaultSimpleDropdown, "Dropdown Default Verification Failed!");

    }

    @Test
    public void stateDropDown() {

        driver.get("https://practice.cydeo.com/dropdown");
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateDropdown = new Select(driver.findElement(By.id("state")));

        String actualDefaultStateDropdown = stateDropdown.getFirstSelectedOption().getText();
        String expectedDefaultStateDropdown = "Select a State";

        Assert.assertEquals(actualDefaultStateDropdown, expectedDefaultStateDropdown, "Dropdown Default Verification Failed!");
    }
}


