package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSelenium06_System_GetPro_Selenium3 {

    // For Firefox browser the driver used is GeckoDriver only in System.setProperty one line
    //In Selenium 3.14 we had to set the driver
//System.setProperty("WebDriver.gecko.driver","path to gecko driver");
    //But in selenium 4 we don't need to write the above line
    // For InternetExplorer browser the driver used is InternetExplorerDrive

    InternetExplorerDriver driver = new InternetExplorerDriver();
    FirefoxDriver driver1 = new FirefoxDriver();
    EdgeDriver driver2 = new EdgeDriver();
}
