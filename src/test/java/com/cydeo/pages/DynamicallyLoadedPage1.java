package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage1 {

    @FindBy(xpath = "//button[.='Start']")
    public WebElement start;

    @FindBy(id = "loading")
    public WebElement loading;

    @FindBy(css = "#username")
    public WebElement usernameInputInbox;

    @FindBy(css = "#pwd")
    public WebElement passwordInputInbox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn;

    @FindBy(css = "#flash")
    public WebElement errorMsg;

    public DynamicallyLoadedPage1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
