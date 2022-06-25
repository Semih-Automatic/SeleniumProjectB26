package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    @FindBy(id = "alert")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@class ='rounded mx-auto d-block']")
    public WebElement image;

    public DynamicLoadingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
