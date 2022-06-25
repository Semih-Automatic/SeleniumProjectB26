package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_POM_ActionsPractices {

    CydeoPracticePage cydeoPracticePage; //THIS IS NOW A GLOBAL OBJECT SO ALL TESTS CAN ACCESS IT.
    Actions actions;//THIS IS NOW A GLOBAL OBJECT SO ALL TESTS CAN ACCESS IT.
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("drag.drop.url"));
        cydeoPracticePage = new CydeoPracticePage();
        actions = new Actions(Driver.getDriver());
    }

    @Test
    public void drag_small_circle_text(){

    //1. Open a chrome browser
    //2. Go to: https://practice.cydeo.com/drag_and_drop_circles
        //Driver.getDriver().get(ConfigurationReader.getProperty("drag.drop.url")); WE DONT NEED THIS SINCE ITS IN BEFORE METHOD

    //3. Verify expected default text appears on big circle
        //Expected = "Drag the small circle here."

        // WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        //INSTEAD OF THIS WE WILL USES ELEMENT FROM OUR PAGES PACKAGE

        //CydeoPracticePage cydeoPracticePage = new CydeoPracticePage(); WE DONT NEED THIS SINCE ITS IN BEFORE METHOD
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drag the small circle here.");
    }

    @Test
    public void drop_here_text(){
    //TC #3: Cydeo Practice Drag and Drop Test
    //1. Open a chrome browser
    //2.  Go to: https://practice.cydeo.com/drag_and_drop_circles
    //3. Click and hold small circle


        //Actions actions = new Actions(Driver.getDriver()); WE DONT NEED THIS SINCE ITS IN BEFORE METHOD
        actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold().moveByOffset(100,0).perform();


    //4. Verify "Drop here." text appears on big circle
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drop here.");
    }

    @Test
    public void now_drop_text(){
        //TC #3: Cydeo Practice Drag and Drop Test
        //1. Open a chrome browser
        //2.  Go to: https://practice.cydeo.com/drag_and_drop_circles
        //3. Click and hold small circle

        actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold().moveToElement(cydeoPracticePage.bigCircle).perform();

        //4. Verify "Drop here." text appears on big circle
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Now drop...");
    }

}
