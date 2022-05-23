package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Day08_Actions1 extends TestBase {
    @Test
    public void test(){

    //        contextClickMethod() and test the following scenario:
    //        Given user is on the https://the-internet.herokuapp.com/context_menu
    //        When use Right-clicks on the box
    //        Then verify the alert message is “You selected a context menu”
    //        Then accept the alert


//        Given user is on the https://the-internet.herokuapp.com/context_menu
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box = driver.findElement(By.xpath("//div[@id='hot-spot']"));

        //
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();


        String expectedText = "You selected a context menu";
        String actualText = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedText,actualText);
        driver.switchTo().alert().accept();
        String firstPageWindowHandleValue = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@target='_blank']")).click();
        Set<String> handleSet = driver.getWindowHandles();
        String secondPageWindowHandleValue = "";
        for (String each: handleSet) {
            if (!each.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= each;
            }

        }

        driver.switchTo().window(secondPageWindowHandleValue);
        WebElement textElement = driver.findElement(By.tagName("h1"));
        String actualTextInSecondPage = "Elemental Selenium";
        String expectedTextInSecondPage = textElement.getText();
        Assert.assertEquals(expectedTextInSecondPage,actualTextInSecondPage);

    }
}
