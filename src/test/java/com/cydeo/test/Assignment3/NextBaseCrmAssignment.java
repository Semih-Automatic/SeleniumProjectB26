package com.cydeo.test.Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCrmAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // WEBDRIVER SETTING UP CHROMEDRIVER

        WebDriver driver = new ChromeDriver(); // CREATING A NEW CHROMEDRIVER OBJECT WITH WEBDRIVER REFERENCE

        driver.manage().window().maximize(); // MAXIMIZES THE SCREEN

        driver.get("https://login2.nextbasecrm.com"); // DRIVER GETS URL

        Thread.sleep(2000); //PAUSES OUR AUTOMATION FOR 2000ms

        WebElement loginField = driver.findElement(By.name("USER_LOGIN")); // LOCATES LOGIN FIELD BY ITS UNIQUE NAME AND STORES IT AS AN OBJECT

        loginField.sendKeys("helpdesk49@cybertekschool.com"); // ALLOWS US TO INPUT A VALID USERNAME

        WebElement passwordField = driver.findElement(By.name("USER_PASSWORD")); // LOCATES PASSWORD FIELD BY ITS UNIQUE NAME AND STORES IT AS AN OBJECT

        passwordField.sendKeys("UserUser"); // ALLOWS US TO INPUT A VALID PASSWORD

        Thread.sleep(2000); //PAUSES OUR AUTOMATION FOR 2000ms

        WebElement loginButton = driver.findElement(By.className("login-btn")); // LOCATES LOGIN BUTTON BY ITS CLASS NAME AND STORES IT AS AN OBJECT

        loginButton.click(); // CLICKS ON THE OBJECT TO OPEN IT

        Thread.sleep(2000); //PAUSES OUR AUTOMATION FOR 2000ms

        driver.quit();



    }
}
