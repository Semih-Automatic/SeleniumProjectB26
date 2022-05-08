package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {

    public static void main(String[] args) throws InterruptedException { //the throws is added when we add an exception to a method signature in this context we did it for the Thread.sleep() method to add milliseconds.

        // Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // Create instance of webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");

        driver.navigate().to("https://www.etsy.com"); // These both do the same thing, however navigate has more options like going forward and backward

        Thread.sleep(3000); //Gives us time before running the next line of code

        driver.navigate().back(); // Takes us one page back

        Thread.sleep(1000);

        driver.navigate().forward(); // Takes us one page forward

        Thread.sleep(2000);

        driver.navigate().refresh(); // Refreshes our page

        driver.getTitle(); // Return type stored as a String which grabs the title of the page

        System.out.println(driver.getTitle()); // I could either print it directly

        String currentTitle = driver.getTitle(); // Or I can store it to a variable and use it later

        System.out.println(currentTitle);

        driver.get("https://www.tesla.com");

        System.out.println(driver.getTitle());

        driver.getCurrentUrl(); // //Return type stored as a String which grabs the URL of the page

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // I could either print it directly by writing .soutv at the end of method

        String currentURL = driver.getCurrentUrl(); // Or I can store it to a variable and use it later

        System.out.println(currentURL);

        driver.close(); //This will close the current Page but driver still open in the background

        //driver.quit(); // closes the driver completely


    }
}
