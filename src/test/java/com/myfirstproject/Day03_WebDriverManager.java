package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_WebDriverManager {

    @Test
    public void googleSearch(){
        // Search for


        // Set the path
        // System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        // We no longer
        WebDriverManager.chromedriver().setup();
        // Create chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the window
        driver.manage().window().maximize();
        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
