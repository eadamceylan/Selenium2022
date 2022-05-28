package com.myfirstproject;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Day11_ExtentReports extends TestBase {
    @Test
    public void extentReportTest(){

//        Done with configuration......
//        logging the test steps in the report
        extentTest.info("User goes to google home page");
        extentTest.pass("User goes to google home page");
        extentTest.fail("User goes to google home page");
        extentTest.skip("User goes to google home page");
        extentTest.warning("User goes to google home page");
        driver.get("https://www.google.com");
        extentTest.info("User search for cybertruck release date");
        driver.findElement(By.name("q")).sendKeys("Tesla Cybertruck release date"+ Keys.ENTER);
        extentTest.pass("Closing the browser");
//        Generating and Ending the report

    }
}