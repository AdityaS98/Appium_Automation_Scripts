package com.appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    public AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("It is Starting");

    }

    @Test
    public void addition() {
        WebElement ele1 = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        ele1.click();

        WebElement add = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        add.click();

        WebElement ele2 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        ele2.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();

        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
        Assert.assertEquals(result.getText(), "9");
    }

    @Test
    public void substraction() {
        WebElement ele1 = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
        ele1.click();

        WebElement sub = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        sub.click();

        WebElement ele2 = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        ele2.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();

        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
        Assert.assertEquals(result.getText(), "5");
    }

    @Test
    public void multiplication() {
        WebElement ele1 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        ele1.click();

        WebElement mul = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        mul.click();

        WebElement ele2 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        ele2.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();

        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
        Assert.assertEquals(result.getText(), "36");
    }

    @Test
    public void division() {
        WebElement ele1 = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        ele1.click();

        WebElement div = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        div.click();

        WebElement ele2 = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        ele2.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();

        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
        Assert.assertEquals(result.getText(), "2");
    }
}