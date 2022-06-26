package com.cydeo.test.day18_review;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T2_JavascriptExecutor_Scroll {





    @Test
    public void java_script_executor_scroll() throws InterruptedException {

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //a.  750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,750)");
        }


        //b.  750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-750)");
        }
    }
}
