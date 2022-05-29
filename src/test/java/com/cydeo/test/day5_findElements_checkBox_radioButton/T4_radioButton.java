package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_radioButton {

    public static void main(String[] args) {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");

        //3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id= 'hockey']"));
        hockeyButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("Is the hockey button selected? " + hockeyButton.isSelected());

        //5. Locate "Green" radio button and verify that it is enabled.
        WebElement greenButton = driver.findElement(By.xpath("//input[@id= 'green']"));
        System.out.println("Is the green button enabled? " + greenButton.isEnabled());

        driver.quit();
    }
}
