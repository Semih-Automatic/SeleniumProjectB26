package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_checkBox {

    public static void main(String[] args) {

        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("Is checkbox 1 selected? " + checkBox1.isSelected());
        /*
        YOU CAN ALSO WRITE
        if(!checkBox1.isSelected()){
            System.out.println("Checkbox1 is not selected");
            } else{
                System.out.println("Checkbox1 is selected");
              }
         */

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name= 'checkbox2']"));
        System.out.println("Is checkbox 2 selected? " + checkBox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("Is checkbox 1 selected now? " + checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("Is checkbox 2 selected now? " + checkBox2.isSelected());

        driver.quit();
    }
}
