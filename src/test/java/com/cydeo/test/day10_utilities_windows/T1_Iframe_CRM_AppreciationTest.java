package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Iframe_CRM_AppreciationTest extends TestBase {
    //1- Open a chrome browser

    @Test
    public void sendingAppreciationMethod() {

        //2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");

        //3- Login Homepage ( Login with valid username and password)
        CRM_Utilities.crm_login(driver, "helpdesk49@cybertekschool.com", "UserUser" );

        // CRM_Utilities.crm_login(driver);

        /* THE TOP LINES DO EVERYTHING BELOW By calling the method from CRM_Utilities Class
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("helpdesk49@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        */

        //4- Click the MORE tab and select APPRECIATION
        WebElement moreButton = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        moreButton.click();

        WebElement appreciationButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[2]/span[2]"));
        appreciationButton.click();

        //5- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.className("bx-editor-iframe")));

        WebElement textMessage = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        textMessage.sendKeys("SemiAutomation");

        //6- Click the SEND button
        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent(); is better to use
        driver.findElement(By.xpath("//button[@id='blog-submit-button-save']")).click();

        //7- Verify the Appreciation message is displayed on the feed
        WebElement text = driver.findElement(By.xpath("//div[@id='blog_post_outer_7322']"));
        String expectedText = "SemiAutomation";

        String actualText = text.getText();
        Assert.assertEquals(actualText, expectedText);
    }
}
