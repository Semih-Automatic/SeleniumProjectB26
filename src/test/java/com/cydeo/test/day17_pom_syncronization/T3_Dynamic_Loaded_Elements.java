package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.pages.DynamicLoadingPage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_Dynamic_Loaded_Elements {
    DynamicLoadingPage dynamicLoadingPage;
    Actions actions;
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("dynamic.load.url"));
        dynamicLoadingPage = new DynamicLoadingPage();
        actions = new Actions(Driver.getDriver());
    }

    @Test
    public void dynamic_load(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3. Assert: Message “Done” is displayed.
        Assert.assertEquals(dynamicLoadingPage.doneMessage.getText(), "Done!");

        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicLoadingPage.image.isDisplayed());
    }
}
