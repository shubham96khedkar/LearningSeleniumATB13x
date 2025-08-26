package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Code(){

        Assert.assertEquals("Shubham", "Shubham");
    }

    @Test
    public void test_openTheTestingAcademy(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");
    }
}
