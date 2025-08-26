package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium07_Selenium_Commands {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
//In above line, it will print the title of the tab

        System.out.println(driver.getCurrentUrl());
//In above line,it will print the current url from url search box

        System.out.println(driver.getPageSource());
//In above line, it will print the HTML page source which we get after right click then click on view page source on a webpage

        driver.quit();
//In above line, it will close all the tabs of the browser and also close the browser

    }
}
