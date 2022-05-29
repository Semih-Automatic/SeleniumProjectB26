package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {

    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);// Providing extra time for our driver before it throws NoSuchElementException
        /*
        ImplicitWait will check DOM (HTML PAGE) and wait until given seconds if there are any web elements not available
        ImplicitWait will continue when the page is loaded.
        It does NOT have to wait until given seconds, if the page loaded.
        It is triggered ONLY if .findElement/s method can’t locate web elements immediately.
         */

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("Number of Links on page = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks){
            System.out.println("Text of each link" + each.getText());
            System.out.println("href of each link" + each.getAttribute("href"));
        }

    }

}
