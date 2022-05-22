package com.cydeo.test.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_Css {

    public static void main(String[] args) {


        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        WebElement logIn = driver.findElement(By.cssSelector("input[type='submit']"));
        String expectedText = "Log In";
        String actualText = logIn.getAttribute("value");

        if(actualText.equals(expectedText)){
            System.out.println("Button Text Verification Passed");
        } else {
            System.out.println("Button Text Verification Failed");
        }

        driver.quit();
    }
}