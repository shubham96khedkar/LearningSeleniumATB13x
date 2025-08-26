package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_Change_Driver {

    public static void main(String[] args) {

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
//In above 2 lines,first it will first open Chrome browser and then open Firefox browser

       // ChromeDriver driver2 = new ChromeDriver();
       // driver2 = new FirefoxDriver();
//Above 2 lines are not possible.It will throw error.

    }
}
