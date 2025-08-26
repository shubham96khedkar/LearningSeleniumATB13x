package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium04 {

    public static void main(String[] args) {

        //Webdriver hierarchy
//INTERVIEW QUESTION
//HOW MANY FUNCTIONS ARE THERE IN SEARCHCONTEXT INTERFACE ?
//IN SEARCH CONTEXT THERE ARE 2 FUNCTIONS
// i.e DRIVER.FINDELEMENT AND DRIVER.FINDELEMENTS

//WebDriver Interface has 10 functions or Methods(learn the functions properly for interview)
//RemoteWebDriver has 15 functions
//ChromiumDriver has 25 functions
//EdgeDriver has 45 functions

//What is Chromium?
// -->Chromium is an open source project

        SearchContext driver = new EdgeDriver();
    //Above statement is possible.See the webdriver hierarchy diagram.
    //Great grand father(SearchContext) reference with child(EdgeDriver)
//Above statement is also called as dynamic dispatch

       // WebDriver driver = new ChromeDriver();
       // RemoteWebDriver driver1 = new ChromeDriver();
       // ChromeDriver driver2 = new ChromeDriver();
//Above 3 statements are also possible.Reason is same as above.see teh WebDriver hierarchy

        //Scenerios--->>> Now which statement to use
    //1. If you want to run either on Chrome or edge
    // then use ChromeDriver driver  = new ChromeDriver();(2-3% used)

    //2. If you want to run on Chrome and then want to change to edge
    // then use Webdriver driver = new ChromeDriver();(96% used)
       //   driver = new EdgeDriver(); In point no.1 we cannot change to Edgrdriver

    //3. If you want to run on multiple browser
    // then use RemoteWebDriver driver = new ChromrDriver();(2% used)



    }
}
