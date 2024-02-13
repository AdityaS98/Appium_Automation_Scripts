package com.android.emulator;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Alarm {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("appPackage", "com.google.android.deskclock");
        dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("Clock is starting");
    }

    @Test
    public void setAlarm() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]")).click();
        driver.findElement(By.id("com.google.android.deskclock:id/digital_clock")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("7")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("20")).click();
        driver.findElement(By.id("android:id/am_label")).click();
        driver.findElement(By.id("android:id/button1")).click();
    }
}
