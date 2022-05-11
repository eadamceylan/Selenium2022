package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {

    public static void main(String[] args) {
        // Set the path
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        // Create chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the window
        driver.manage().window().maximize();
        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        //      Verify if expected equals actual
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
            System.out.println("Expected : "+expectedTitle);
            System.out.println("Actual : "+actualTitle);
        }else{
            System.out.println("FAILED");
            System.out.println("Expected : "+expectedTitle);
            System.out.println("Actual : "+actualTitle);
        }

        driver.quit();


    }
}
