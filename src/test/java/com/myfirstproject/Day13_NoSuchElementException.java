package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day13_NoSuchElementException {

   WebDriver driver;
   @Before
   public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();

   }


    @Test
    public void noSuchElementExceptionTest(){
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.linkText("navLogon")).click();//Wrong locator.linkText should be id.NoSuchElementException
    }
    @Test
    public void noSuchElementExceptionTest2(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        String helloWorld = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
        Assert.assertEquals("Hello World!",helloWorld);//ComparisonFailure. This is not same as no such element exception
    }
}