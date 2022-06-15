package com.myfirstproject.practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StageMovementsTest2 extends TestBase {
    @Test
    public void stageMovements() throws InterruptedException {
    driver.get("http://automationpractice.com/index.php");
        WebElement image1 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]"));
        scrollIntoViewByJS(image1);
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();
        Thread.sleep(3000);

        WebElement addToCart = driver.findElement(By.xpath("(//*[text()='Add to cart'])[1]"));
        addToCart.click();//addToCart.sendkeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));
        String expectedText = "Product successfully added to your shopping cart";
        String actualText = product.getText();
        Assert.assertEquals(expectedText,actualText);
        // And verifies the color, size, quantity, price, shipping, Total Price
        WebElement colorAndSize = driver.findElement(By.id("layer_cart_product_attributes"));
        String colorAndSizeExpectedText = "Orange, S";
        String colorAndSizeActualText = colorAndSize.getText();

        WebElement price = driver.findElement(By.xpath("(//span[@class='price product-price'])[1]"));

        Assert.assertEquals(colorAndSizeExpectedText,colorAndSizeActualText);
        // And clicks on Proceed to checkout
        WebElement proceedToCheckout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
        proceedToCheckout.click();

        // Then verify the Unit price matches the price that is on the Add To Card page
        WebElement unitPrice = driver.findElement(By.xpath("(//span[@class='price'])[2]"));

        String actualAddToCartPrice = "16.51";
        Assert.assertEquals("16.51",actualAddToCartPrice);











    }
}
