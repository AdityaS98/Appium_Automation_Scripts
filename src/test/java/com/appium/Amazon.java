package com.appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Amazon {

    public AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        // dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        // dc.setCapability("chromeOption", ImmutableMap.of("w3c",false));
        dc.setCapability("appPackage", "com.android.chrome");
        dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("It is Starting");

    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
        Thread.sleep(4000);
        WebElement search = driver.findElement(By.id("com.android.chrome:id/search_box_text"));
        search.click();
        WebElement url = driver.findElement(By.id("com.android.chrome:id/url_bar"));
        url.sendKeys("www.amazon.in");
        Thread.sleep(2000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
        WebElement amazonsearch = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
                "/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                "/android.webkit.WebView/android.view.View[1]/android.view.View[1]" +
                "/android.view.View/android.view.View[2]/android.view.View[1]" +
                "/android.view.View[1]/android.view.View"));
        amazonsearch.click();
        // Thread.sleep(4000);
        amazonsearch.sendKeys("Iphone");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View")).click();


    }
}
