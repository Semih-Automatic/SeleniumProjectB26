package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before the class runs");

    }

    @AfterClass
    public void tearDown(){
        System.out.println("Runs after the class is done");

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Runs Before Every Method");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("Runs After Every Method");
    }

    @Test (priority = 2 , dependsOnMethods = "test3") // the depends on here makes sure that this test only runs if the other test passes
    public void test1(){
        System.out.println("Test 1 is running..."); //Total tests run: 1, Passes: 0, Failures: 0, Skips: 0
        String actual = "apple";
        String expected = "apple";
        //                  Actual, Expected, Optional Message in case of error
        Assert.assertEquals(actual, expected, "Test did not pass!");
    }

    public void test2(){
        System.out.println("Test 2 is running..."); // THIS ONE DOEST RUN AND THE CODE SHOWS Total tests run: 1, Passes: 1, Failures: 0, Skips: 0 BECAUSE WE DONT HAVE THE @Test annotation in beginning of this method
    }

    @Test (priority = 1) // Because I wrote priority = 1; this test runs before test1. If we don't annotate priority then testng runs tests according to alphabetic order.
    public void test3(){
        System.out.println("Test 3 is running..."); //THIS ONE RUNS SINCE IT HAS THE @Test annotation in the beginning
        Assert.assertEquals("orange", "orange", "Test didnt pass!");

    }
}
