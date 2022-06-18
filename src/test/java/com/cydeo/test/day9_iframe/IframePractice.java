package com.cydeo.test.day9_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframePractice extends TestBase { //our testbase has before and after method

    //TC #6: Iframe Task
    //1- Open a chrome browser


    @Test
    public void IframePractice(){

        //2- Go to: https://practice.cydeo.com/iframe
        driver.get("//2- Go to: https://practice.cydeo.com/iframe");

        //3- Clear text from comment body
        WebElement commentBody = driver.findElement(By.id("tinymce"));
        commentBody.clear();

        //4- Type "Hello World" in comment body
        //5- Verify "Hello World" text is written in comment body
        //6- Verify header "An iFrame containing the TinyMCE
        //WYSIWYG Editor" is displayed

    }

}
