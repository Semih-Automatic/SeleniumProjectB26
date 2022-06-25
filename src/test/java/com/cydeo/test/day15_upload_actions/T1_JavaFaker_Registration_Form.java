package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_JavaFaker_Registration_Form {

    @Test
    public void registration_form_test(){

//    Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
//    3. Enter first name
        WebElement firstName = Driver.getDriver().findElement(By.name("firstname"));

        Faker faker = new Faker();
        firstName.sendKeys(faker.name().firstName());

//    4. Enter last name
        WebElement lastName = Driver.getDriver().findElement(By.name("lastname"));
        lastName.sendKeys(faker.name().lastName());

//    5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.name("username"));
        userName.sendKeys(faker.bothify("?????####"));

//    6. Enter email address
        WebElement eMail = Driver.getDriver().findElement(By.name("email"));
        eMail.sendKeys(faker.internet().emailAddress());

//    7. Enter password
        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys(faker.internet().password());

//    8. Enter phone number
        WebElement phone = Driver.getDriver().findElement(By.name("phone"));
        phone.sendKeys(faker.phoneNumber().phoneNumber());

//    9. Select a gender from radio buttons
        WebElement gender= Driver.getDriver().findElement(By.cssSelector(" input[value='female']"));
        gender.click();

//    10.Enter date of birth
        Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys(""+faker.numerify("0#/1#/19##"));

//    11.Select Department/Office
        Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        office.selectByIndex(faker.number().numberBetween(1,9));

//    12.Select Job Title
        Select job = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        job.selectByIndex(faker.number().numberBetween(1,8));

//    13.Select programming language from checkboxes

//    14.Click to sign up button
//    15.Verify success message “You’ve successfully completed registration.” is
//    displayed.

        Driver.closeDriver();
    }
}
