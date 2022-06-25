package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {

    @Test
    public void upload_file_test(){
//    1. Go to “http://demo.guru99.com/test/upload”
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.upload.url"));

//    2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
        String path = "C:\\Users\\Semih\\Desktop\\SDLC & WHAT WE TEST.txt";
        chooseFile.sendKeys(path); //We dont click because then it will open a folder out of browser and selenium will not be able to handle. Hence we send the path of the file we want to upload as sendKeys

//    3. Click terms of service checkbox
        WebElement terms = Driver.getDriver().findElement(By.id("terms"));
        terms.click();

//    4. Click Submit File button
        WebElement submit = Driver.getDriver().findElement(By.id("submitbutton"));
        submit.click();

//    5. Verify expected message appeared.
//    Expected: “1 file has been successfully uploaded.”
        String actualMessage = Driver.getDriver().findElement(By.id("res")).getText();
        String expectedMessage = "1 file\nhas been successfully uploaded.";
        Assert.assertEquals(actualMessage,expectedMessage,"Message Verification Failed!");

        Driver.closeDriver();
    }
}
