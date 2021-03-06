package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerification {

    /*
        TC #1: Yahoo Title Verification
            1. Open Chrome browser
            2. Go to https://www.yahoo.com/
            3. Verify title:
            Expected: Yahoo
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // WEBDRIVER SETTING UP CHROMEDRIVER

        WebDriver driver = new ChromeDriver(); // CREATING A NEW CHROMEDRIVER OBJECT WITH WEBDRIVER REFERENCE

        driver.get("https://www.yahoo.com"); // DRIVER GETS THE YAHOO URL

        driver.manage().window().maximize(); // MAXIMIZES THE SCREEN

        String actualTitle = driver.getTitle(); // STORES TITLE AS STRING VARIABLE

        String expectedTitle = "Yahoo"; // DECLARE AN ASSIGN expectedTitle VARIABLE

        System.out.println(actualTitle.contains(expectedTitle) ? "Passed": "Failed"); // TERNARY WHICH CHECKS IF ACTUAL CONTAINS EXPECTED VALUE

        Thread.sleep(2000); // SLOWS DOWN THE DRIVER FOR 2000 ms

        driver.close(); // CLOSES THE TAB


    }
}
