package com.cydeo.test.day2_locators;

/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) throws InterruptedException { // Exception to Thread.sleep(1000) method

        WebDriverManager.chromedriver().setup(); // WEBDRIVER SETTING UP CHROMEDRIVER

        WebDriver driver = new ChromeDriver(); // CREATING A NEW CHROMEDRIVER OBJECT WITH WEBDRIVER REFERENCE

        driver.manage().window().maximize(); // MAXIMIZES THE SCREEN

        driver.get("https://practice.cydeo.com"); // DRIVER GETS URL

        Thread.sleep(1000); // SLOWS DOWN THE DRIVER FOR 1000 ms

        WebElement abLinkText = driver.findElement(By.linkText("A/B Testing")); // LOCATES BY THE HYPERLINKED ELEMENT CONTENT AND STORES IT AS AN OBJECT

        abLinkText.click(); // CLICKS ON THE OBJECT TO OPEN IT

        String actualTitle = driver.getTitle(); // STORES TITLE AS STRING VARIABLE

        String expectedTitle = "No A/B Test"; // DECLARE AN ASSIGN expectedTitle VARIABLE

        System.out.println((actualTitle.equals(expectedTitle)) ? "A/B Testing Title Verification Passed" : "A/B Testing Title Verification Failed"); // TERNARY WHICH CHECKS IF ACTUAL CONTAINS EXPECTED VALUE

        Thread.sleep(1000); // SLOWS DOWN THE DRIVER FOR 1000 ms

        driver.navigate().back(); // NAVIGATES THE PAGE BACK BY ONE

        String actualTitle2 = driver.getTitle(); // STORES TITLE AS STRING VARIABLE

        String expectedTitle2 = "Practice"; // DECLARE AN ASSIGN expectedTitle VARIABLE

        System.out.println((actualTitle2.equals(expectedTitle2)) ? "Home Page Title Verification Passed" : "Home Page Title Verification Failed");
        // TERNARY WHICH CHECKS IF ACTUAL CONTAINS EXPECTED VALUE

        Thread.sleep(1000); // SLOWS DOWN THE DRIVER FOR 1000 ms

        driver.quit(); // CLOSES THE CHROME DRIVER




    }
}
