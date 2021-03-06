package com.cydeo.test.day4_cssSelector_xpath;


import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {

    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
                            //driver.findElement(By.cssSelector("a[class='nav-link']"));
                            //driver.findElement(By.cssSelector("a[href='/']"));

        WebElement homeLink2 = driver.findElement(By.xpath("//a[.='Home']")); // The dot represents text()
                             //driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div[class='example']>h2"));
                                        //driver.findElement(By.cssSelector("div.example>h2"));

        WebElement forgotPasswordHeader2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement emailText2 = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        WebElement RetrievePasswordButton = driver.findElement(By.cssSelector("button#form_submit"));

        // f. “Powered by Cydeo text
        WebElement poweredCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println(homeLink.isDisplayed());
        System.out.println(forgotPasswordHeader.isDisplayed());
        System.out.println(emailText.isDisplayed());
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(RetrievePasswordButton.isDisplayed());
        System.out.println(poweredCydeoText.isDisplayed());

        System.out.println();

        System.out.println(homeLink2.isDisplayed());
        System.out.println(forgotPasswordHeader2.isDisplayed());
        System.out.println(emailText2.isDisplayed());
        System.out.println(emailInputBox2.isDisplayed());

        driver.quit();

    }

}
