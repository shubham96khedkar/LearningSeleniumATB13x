package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_Vs_Quit {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //How can we wait for few seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//Thread.sleep() is a java wait.It is not a WebDriver wait.We are telling the compiler to wait

        //driver.close();
//driver.close() will close the current tab.It will not close the session(not close all the tabs)
        //session id != null

        driver.quit();
// driver.quit() will close all the tabs
        //session id == null
    }

}
