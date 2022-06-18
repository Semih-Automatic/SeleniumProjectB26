package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//Method #1 info:
//• Name: returnOrderDate ()
//• Return type: String
//• Arg1: WebDriver driver
//• Arg2: String costumerName
//This method should accept a costumerName and return the costumer order date as a String.

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName) {

        return driver.findElement(By.xpath("//td[.='" + customerName + "']//following-sibling::td[3]")).getText();
    }

    /*THIS IS THE LONG VERSION OF THE SAME THING

    public static String returnOrderDate(WebDriver driver, String customerName) {
        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }

    */



    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String customerName
    //• Arg3: String expectedOrderDate
    //This method should accept above-mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.


    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {

        Assert.assertEquals(driver.findElement(By.xpath("//td[.='" + customerName + "']//following-sibling::td[3]")).getText(), expectedOrderDate);
    }

    /* THIS IS THE LONG VERSION OF THE SAME THING

    public static void orderVerify2(WebDriver driver, String customerName, String expectedOrderDate) {
        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);
    }

     */

}
