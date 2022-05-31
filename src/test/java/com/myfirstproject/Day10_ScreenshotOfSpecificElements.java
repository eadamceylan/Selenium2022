package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Day10_ScreenshotOfSpecificElements extends TestBase {
    @Test
    public void screenshotTest() throws IOException {
        driver.get("https://www.google.com");
        WebElement googleSearchLogo = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
        File logoImage = googleSearchLogo.getScreenshotAs(OutputType.FILE);
//        Saving the image to  the path
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File finalPath = new File("./test-output/elements/googleSearchLogo"+currentDate+".png");
        FileUtils.copyFile(logoImage,finalPath);


        /***********************************************************************************************************/
//        getting screenshot of sign in element
        WebElement signInButton = driver.findElement(By.xpath("//*[.='Sign in']"));
        File signInImage = signInButton.getScreenshotAs(OutputType.FILE);
        String currentDate2 = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File signInPath = new File("./test-output/elements/signIn"+currentDate2+".png");
        FileUtils.copyFile(signInImage,signInPath);
    }
}
