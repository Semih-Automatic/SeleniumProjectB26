package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - log in or sign up”
 */
public class T1_FacebookTitleVerification {

    public static void main(String[] args) throws InterruptedException { // Exception to Thread.sleep(2000) method

        WebDriverManager.chromedriver().setup(); // WEBDRIVER SETTING UP CHROMEDRIVER

        WebDriver driver = new ChromeDriver(); // CREATING A NEW CHROMEDRIVER OBJECT WITH WEBDRIVER REFERENCE

        driver.get("https://www.facebook.com"); // DRIVER GETS THE FACEBOOK URL

        driver.manage().window().maximize(); // MAXIMIZES THE SCREEN

        String actualTitle = driver.getTitle(); // STORES TITLE AS STRING VARIABLE

        String expectedTitle = "Facebook - log in or sign up"; // DECLARE AN ASSIGN expectedTitle VARIABLE

        System.out.println((actualTitle.equals(expectedTitle)) ? "Title Verified" : "Wrong Title"); // TERNARY WHICH CHECKS IF ACTUAL CONTAINS EXPECTED VALUE

        Thread.sleep(2000); // SLOWS DOWN THE DRIVER FOR 2000 ms

        driver.quit(); // CLOSES THE CHROME DRIVER
    }
}
