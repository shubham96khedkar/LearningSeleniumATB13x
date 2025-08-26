package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium08_Maximize_Minimize {

    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");

    driver.manage().window().maximize();
//In above line, it will maximize the window.
  //driver.manage().window().minimize();
// //In above line, it will minimize the window.

        driver.quit();
//In above line,it will close the browser



    }
}
