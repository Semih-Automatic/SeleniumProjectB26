package com.cydeo.test.day2_locators;

/*
1- Open a chrome browser
2- Go to: https://google.com/
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // WEBDRIVER SETTING UP CHROMEDRIVER

        WebDriver driver = new ChromeDriver(); // CREATING A NEW CHROMEDRIVER OBJECT WITH WEBDRIVER REFERENCE

        driver.manage().window().maximize(); // MAXIMIZES THE SCREEN

        driver.get("https://google.com/"); // DRIVER GETS URL

        WebElement searchBar = driver.findElement(By.name("q")); // LOCATES INPUT SEARCH BAR BY ITS UNIQUE NAME AND STORES IT AS AN OBJECT

        searchBar.sendKeys("apple"); // ALLOWS US TO SEND A STRING INTO AN INPUT BOX

        WebElement googleSearchButton = driver.findElement(By.name("btnK")); // LOCATES CLICK BUTTON BY ITS UNIQUE NAME AND STORES IT AS AN OBJECT

        googleSearchButton.click(); // CLICKS ON THE OBJECT TO OPEN IT

        /*
        You could have also used

        searchBar.sendKeys("apple" + Keys.ENTER); // Keys.ENTER also sends ENTER from our keyboard after sending out String Keys must be used inside of .sendKeys method

        instead of line 34 and 36
         */

        String actualTitle = driver.getTitle(); // DECLARES AND STORES TITLE AS STRING VARIABLE

        String expectedTitle = "apple"; // DECLARE AN ASSIGN expectedTitle VARIABLE

        System.out.println((actualTitle.startsWith(expectedTitle)) ? "Tittle Verification Passed": "Title Verification Failed"); // TERNARY WHICH CHECKS IF ACTUAL CONTAINS EXPECTED VALUE

        driver.quit(); // CLOSES THE CHROME DRIVER

    }
}
