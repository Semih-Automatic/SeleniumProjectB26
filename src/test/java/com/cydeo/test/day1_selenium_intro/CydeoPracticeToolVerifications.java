package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoPracticeToolVerifications {

    public static void main(String[] args) throws InterruptedException {

        /*
        TC #1: Cydeo practice tool verifications
            1. Open Chrome browser
            2. Go to https://practice.cydeo.com
            3. Verify URL contains
                Expected: cydeo
            4. Verify title:
                Expected: Practice
         */

        WebDriverManager.chromedriver().setup(); // WEBDRIVER SETTING UP CHROMEDRIVER

        WebDriver driver = new ChromeDriver();  // CREATING A NEW CHROMEDRIVER OBJECT WITH WEBDRIVER REFERENCE

        driver.get("https://practice.cydeo.com"); // DRIVER GETS THE CYDEO URL

        driver.manage().window().maximize(); // MAXIMIZES THE SCREEN

        String actualURL = driver.getCurrentUrl(); // STORES CURRENT URL AS STRING VARIABLE

        String expectedURL = "cydeo"; // DECLARE AN ASSIGN expectedURL VARIABLE

        System.out.println(actualURL.contains(expectedURL) ? "URL Verification Passed" : "URL Verification Failed");
        // TERNARY TO CHECK IF actualURL CONTAINS expectedURL

        String actualTitle = driver.getTitle(); // STORES TITLE AS STRING VARIABLE

        String expectedTitle = "Practice"; // DECLARE AN ASSIGN expectedTitle VARIABLE

        if(actualTitle.contains(expectedTitle)){ // IF STATEMENT CHECKS if actualTitle contains expectedTitle
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");
        }
        Thread.sleep(2000);

        driver.quit(); // DRIVER QUITS
    }
}
