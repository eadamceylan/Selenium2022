package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions3 extends TestBase {

    @Test
    public void scrollUpDown() throws InterruptedException {
    driver.get("https://www.amazon.com");
    Thread.sleep(3000);
    // Create an Actions object
    Actions actions = new Actions(driver);

    // Scroll Down 3 times---
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(3000);
    // Scroll up 3 times
    actions.sendKeys(Keys.PAGE_UP).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.PAGE_UP).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.PAGE_UP).perform();
    Thread.sleep(3000);

    // Use ARROW_UP 3 times
    actions.sendKeys(Keys.ARROW_UP).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.ARROW_UP).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.ARROW_UP).perform();
    Thread.sleep(3000);


    // Use ARROW_DOWN 3 times
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);




    }
}
