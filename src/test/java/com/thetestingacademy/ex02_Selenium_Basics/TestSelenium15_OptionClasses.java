package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium15_OptionClasses {

    public static void main(String[] args) {

        ChromeOptions co = new ChromeOptions();
        //co.addArguments("--headless"); //For running in headless mode
       // co.addArguments("--window-size=800,600"); //For running in a particular window size
        co.addArguments("--start-maximized"); //For maximizing the screen right from start
       // co.addArguments("--incognito"); //For running browser in incognito mode
        co.addArguments("--guest"); //For running in guest mode
// As ChromeOptions is used to start the browser with some particular options Before starting browser so this line will be written before launching the browser.
//headless mode means after running the code, the output screen will not be displayed but the title will be printed which means the program is running and it has fetched the title also.

        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        WebDriver driver = new ChromeDriver(co);
//In above line we have to pass the parameter i.e co

        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
