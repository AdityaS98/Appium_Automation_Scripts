package com.appium;//package com.appium;

//package com.appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//
import java.net.MalformedURLException;
import java.net.URL;

//
public class Geny_Motion_Clock {
    //
    public AndroidDriver driver;

    //    Logger log =Logger.getLogger(Calculator.class);
//
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "192.168.88.102:5555");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("appPackage", "com.android.deskclock");
        dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("It is Starting");
//        log.info("Starting the driver");
    }

    @Test
    public void timer() throws InterruptedException {
        WebElement timer = driver.findElement(AppiumBy.accessibilityId("Timer"));
        timer.click();

        driver.findElement(By.id("com.android.deskclock:id/timer_setup_digit_1")).click();
        driver.findElement(By.id("com.android.deskclock:id/timer_setup_digit_0")).click();
        Thread.sleep(2000);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(716, 2222)))).perform();
        Thread.sleep(13000);
        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(369, 461)))).perform();

    }

    //
    @Test
    public void stopwatch() throws InterruptedException {
        WebElement stopwatch = driver.findElement(AppiumBy.accessibilityId("Stopwatch"));
        stopwatch.click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")).click();

        WebElement lap = driver.findElement(AppiumBy.accessibilityId("Lap"));
        lap.click();

        driver.findElement(By.id("com.android.deskclock:id/stopwatch_time_text")).click();
//
        WebElement reset = driver.findElement(AppiumBy.accessibilityId("Reset"));
        reset.click();
    }


    //
    @Test
    public void clock() throws InterruptedException {
        WebElement clock = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]/android.widget.TextView"));
        clock.click();
        Thread.sleep(3000);
//
        driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[1]")).click();
//
        Thread.sleep(2000);
//
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(255, 511)))).perform();
        Thread.sleep(2000);
//
        driver.findElement(AppiumBy.accessibilityId("12")).click();
        Thread.sleep(2000);
//
        driver.findElement(By.id("android:id/minutes")).click();
        Thread.sleep(2000);
//
        driver.findElement(AppiumBy.accessibilityId("0")).click();
        Thread.sleep(2000);
//
        driver.findElement(By.id("android:id/pm_label")).click();
        Thread.sleep(2000);
//
        driver.findElement(By.id("android:id/button1")).click();
        Thread.sleep(2000);
//
        driver.findElement(AppiumBy.accessibilityId("Monday")).click();
        Thread.sleep(2000);
//
        driver.findElement(AppiumBy.accessibilityId("Wednesday")).click();
        Thread.sleep(2000);
//
        driver.findElement(AppiumBy.accessibilityId("Friday")).click();
        Thread.sleep(2000);
//
        driver.findElement(AppiumBy.accessibilityId("Expand alarm")).click();
        Thread.sleep(2000);
//
        driver.findElement(By.id("com.google.android.deskclock:id/delete")).click();

    }

    //
    public static void performTouchAction(AndroidDriver driver, int x, int y) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(x, y)))).perform();

    }
}