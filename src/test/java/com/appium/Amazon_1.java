package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class Amazon_1 {
    AndroidDriver driver;

    @BeforeMethod
    public void setUrl() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");


        cap.setCapability("chromedriverExecutable", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

        cap.setCapability("chromeOptions", Collections.singletonMap("w3c", false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(5000);
    }

    @Test
    public void run() throws InterruptedException {
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.name("k"));
        search.sendKeys("Iphone");
        Thread.sleep(2000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(4000);


        WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']"));
        javascriptExecutor.executeScript("window.scrollTo(0,300)");
        Thread.sleep(3000);
        iphone.click();


        javascriptExecutor.executeScript("window.scrollTo(0,1800)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='cart-size']")).click();

    }
}
