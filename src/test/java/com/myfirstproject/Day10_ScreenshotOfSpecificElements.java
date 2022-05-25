package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
public class Day10_ScreenshotOfSpecificElements extends TestBase {
    @Test
    public void screenshotTest() throws IOException {
        driver.get("https://www.google.com");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File logoImage = googleLogo.getScreenshotAs(OutputType.FILE);

//        Saving the image to  the path
        File finalPath = new File("googleLogo.png");
        FileUtils.copyFile(logoImage,finalPath);
    }
}