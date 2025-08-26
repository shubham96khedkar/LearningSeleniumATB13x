package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigation_GET_NavigateTo {

    @Description("Open the Url")
    @Test
    public void test_Selenium01(){
//In driver.get("url"), the request used is a GET Request(i.e HTTP GET Method or Request)
//In Navigate().to(), there is POST Request or Method used

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

//Another way to open the Url is driver.navigate().to();
        /*
        1. In driver.get("Url") command -> _there is no option to go back, go forward, refresh_
2. In driver.navigate.to() command, We can go :-
    1. back()
    2. forward()
    3. refresh() the page

- Rest driver.navigate().to() command-> is same as driver.get("Url") command -
- Both wait to load the page content or elements
*/
     driver.navigate().to("https://bing.com");
     driver.navigate().back();
     driver.navigate().refresh();
     driver.navigate().forward();



    }


}

