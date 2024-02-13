package com.android.emulator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("Calculator is starting");


    }

    @Test
    public void add() throws InterruptedException {
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }
}
