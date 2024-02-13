package com.android.emulator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Amazon {

    AndroidDriver driver;


    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        dc.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("Amazon is starting");
    }

    @Test

    public void searchProduct() throws InterruptedException {


        WebElement skipBtn = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
        skipBtn.click();
        Thread.sleep(2000);


        WebElement searchBar = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view"));
        //searchBar.click();
        searchBar.sendKeys("Samsung S23 Ultra");
        Thread.sleep(2000);

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_action_bar_search_icon")).click();

    }
}