package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Assertion_TestNG {

//FOR INTERVIEW PURPOSE LEARN ALL THE IMPORTS PROPERLY FROM EACH AND EVERY CLASS IN PACKAGE
    @Description("Verify that the title is visible")
    @Test
    public void test_selenium_assertion(){
        //Assertion means validating the actual Vs Expected result

     WebDriver driver = new ChromeDriver();
     driver.get("https://google.com");

     Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
//In above line, there is TestNG assertion i.e actual(driver.getCurrentUrl) Vs Expected(https://google.com) Output

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");
//In above line,there is AssertJ assertion

//Now can we use here RestAssured assertion also?
// The answer is NO.Because we are not getting the response
//RestAssured assertions only work when we get response in ValidatableResponse Interface

        driver.quit();
    }
}
