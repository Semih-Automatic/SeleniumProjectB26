package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefException {

    public static void main(String[] args) {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick= 'addElement()']")); //can also use (By.xpath("//button[.= 'Add Element']"))
        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement delElementButton = driver.findElement(By.xpath("//button[.= 'Delete']"));
        System.out.println("Delete button is displayed: " + delElementButton.isDisplayed());

        //5. Click to “Delete” button.
        delElementButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.

        try {
            System.out.println("Delete button is NOT displayed: " + delElementButton.isDisplayed()); //STALE ELEMENT REFERENCE ERROR HENCE WHY I PUT TRY AND CATCH SO MY CONSOLE DOESNT STOP WHEN THE EXCEPTION IS THROWN

        } catch(StaleElementReferenceException e){
            System.err.println("StaleElementReferenceException Would Be Thrown");
            System.out.println("This means that the web element is completely deleted from both the page and the html");

        }

        driver.quit();
    }
}
