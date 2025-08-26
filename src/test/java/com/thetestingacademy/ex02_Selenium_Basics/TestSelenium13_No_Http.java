package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_No_Http {

    public static void main(String[] args) {

        //Will the code written below work?
        FirefoxDriver driver = new FirefoxDriver();
       // driver.get("bing.com"); Without https the url won't work
        driver.get("https://bing.com");
        //https is important
        driver.quit();

    }
}
