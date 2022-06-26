package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class JavascriptExecutorPage {


    public JavascriptExecutorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
