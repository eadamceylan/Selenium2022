package com.myfirstproject.grouppractice;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe extends TestBase {

    @Test
    public void iframeTest() {

//  Go to the webpage: https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");
//○ “An IFrame containing....” Check the text in enable or not... and print on the console
        WebElement textElement = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(textElement.isEnabled());
//○ Write “Hello World!” inside of the Text Box instead of " Your content goes here."
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        textBox.clear();
        textBox.sendKeys("Hello World!");
        driver.switchTo().defaultContent();

//○ Check whether the “Elemental Selenium” link text is visible then print on the console.
        WebElement elementalSeleniumTextElement = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        String expectedText = "Elemental Selenium";
        String actualText = elementalSeleniumTextElement.getText();
        Assert.assertEquals(expectedText,actualText);


    }
}
