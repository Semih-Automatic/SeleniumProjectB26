package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T5_findElements_radioButton {

    public static void main(String[] args) {

        //TC #3: Utility method task for (continuation of Task2)
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> allButtons = driver.findElements(By.xpath("//input[@type= 'radio']"));

        System.out.println(allButtons.size());

        for (WebElement eachButton : allButtons){
            eachButton.click();
            System.out.println(eachButton.isSelected() + " ");

        }
    }

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //
        //Create a utility method to handle above logic.
        //Method name: clickAndVerifyRadioButton


    //Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. Name attribute as String (for providing which group of radio buttons)
        //3. Id attribute as String (for providing which radio button to be clicked)
        //
        //Method should loop through the given group of radio buttons. When it finds the
        //matching option, it should click and verify option is Selected.
    }

