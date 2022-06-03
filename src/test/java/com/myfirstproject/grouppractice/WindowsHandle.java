package com.myfirstproject.grouppractice;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WindowsHandle extends TestBase {
    @Test
    public void windowsHandleTest() {

        //1- amazon ana sayfaya gidin. Go to "amazon" webpage
        driver.get("https://www.amazon.com");
        String handleValueOfTheFirstPage = driver.getWindowHandle();
        System.out.println(driver.getWindowHandle()); // CDwindow-00FE5C79A590313483C7FDB93F3F1312
        //2- Nutella icin arama yaptirin. Make a search for "Nutella"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
        //3- ilk urunun resmini tiklayarak farkili bir tab' da acin.
        //   In the result page, click the first image ,but open it inside of new Tab
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
        //4- yeni tab da acilan urunun basligini yazdirin.
        WebElement elementOfTheFirstProductTitle = driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        System.out.println(elementOfTheFirstProductTitle.getText()); // Nutella Chocolate Hazelnut Spread, Perfect Topping for Easter Treats, 26.5 oz (Packaging May Vary)
        //5- Go to first page and print the URL of the first page
        driver.switchTo().window(handleValueOfTheFirstPage);
        System.out.println(driver.getCurrentUrl());
    }
}
