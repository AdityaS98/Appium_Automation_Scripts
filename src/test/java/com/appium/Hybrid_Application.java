package com.appium;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Hybrid_Application {

    public AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        dc.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        System.out.println("It is Starting");
    }

    @Test
    public void timer() throws InterruptedException {
        Thread.sleep(5000);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(703, 1579)))).perform();
        Thread.sleep(20000);

        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(355, 193)))).perform();

        Thread.sleep(5000);

        WebElement search1 = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
        search1.sendKeys("Iphone");
        Thread.sleep(2000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(10000);

////        WebElement element = driver.findElement(By.xpath("//android.view.View[@text='Phone 6s 16gb Gold (New)- Unlocked']"));
////        int x=element.getLocation().getX();
////        int y=element.getLocation().getY();
//
//
//
////        System.out.println(x);
////        System.out.println(y);
//       // JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        //javascriptExecutor.executeScript("window.scrollBy(0,2376)");
//      // javascriptExecutor.executeScript("window.scrollTo(619,2376);");
//        String uiScrollableCommand = "new UiScrollable(new UiSelector().scrollable(true))"
//                + ".scrollIntoView(new UiSelector().text(\"Phone 6s 16gb Gold (New)- Unlocked\"))";
//        ((AndroidDriver<AndroidElement>) driver).findElementByAndroidUIAutomator(uiScrollableCommand);
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Phone 6s Plus 64GB Rose Gold - Unlocked\"));")).click();
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Apple iPhone SE 5G (3rd Generation), 64GB, Black - Prepaid Smartphone (Locked)\"));")).click();

        //    BezosMax 15MINI 4G Unlocked Mini Smartphone with 3.0" HD Screen,3GB+32GB, 2000mAh Battery, Android 9.0, Ultra Thin Body, 5MP Camera, Dual SIM-Pink

//
        List<WebElement> list = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View"));
        int j = 0;
        for (int i = 1; i < list.size(); i++) {

            int num = (i * 2) + 2 + j;
            System.out.println(num);
            WebElement click = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[" + num + "]/android.view.View[4]/android.view.View/android.view.View"));
            String name = click.getText();
            System.out.println(name);
            int x = click.getLocation().getX();
            int y = click.getLocation().getY();
            System.out.println(x);
            System.out.println(y);
//            String uiScrollableCommand = "new UiScrollable(new UiSelector().scrollable(true))"
//                + ".scrollIntoView(new UiSelector().text(\"" + name + "\"))";

            Thread.sleep(3000);
            int startX = driver.manage().window().getSize().getWidth() / 2;
            int startY = (int) (driver.manage().window().getSize().getHeight() * 4 / 5); // 80% from the top
            int endY = (int) (driver.manage().window().getSize().getHeight() / 5);   // 20% from the top

            TouchAction touchAction1 = new TouchAction(driver);
            touchAction1.press(PointOption.point(startX, startY))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();


            Thread.sleep(3000);

            //   ((AndroidDriver<AndroidElement>) driver).findElementByAndroidUIAutomator(uiScrollableCommand).click();
            click.click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            j++;
        }

//        WebElement element1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[24]"));
//        String element2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[24]")).getText();
//        //tapOnElement(element1);
//        String uiScrollableCommand = "new UiScrollable(new UiSelector().scrollable(true))"
//                + ".scrollIntoView(new UiSelector().text(\"" + element2 + "\"))";
//        Thread.sleep(3000);
//
//        ((AndroidDriver<AndroidElement>) driver).findElementByAndroidUIAutomator(uiScrollableCommand);
//        element1.click();

    }

    public void tapOnElement(WebElement element) {
        // Tap on the element using TouchAction
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }

    @Test
    public void addToCart() throws InterruptedException {
        Thread.sleep(20000);
        TouchAction touchAction = new TouchAction(driver);

//        WebElement skipLogin = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
//        skipLogin.click();

        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(703, 1579)))).perform();

        Thread.sleep(8000);
        touchAction.tap(TapOptions.tapOptions().withPosition(PointOption.point(new Point(355, 193)))).perform();

        Thread.sleep(8000);

        WebElement search1 = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
        search1.sendKeys("Iphone");
        Thread.sleep(2000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(10000);

        WebElement click = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[4]/android.view.View/android.view.View"));

        click.click();

//        List<WebElement> list = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View"));
//        int j = 0;
//        for (int i = 1; i < list.size(); i++) {
//
//            int num = (i * 2) + 2 + j;
//            System.out.println(num);
//            WebElement click = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[" + num + "]/android.view.View[4]/android.view.View/android.view.View"));
//            String name = click.getText();
//            System.out.println(name);
//            j++;
//            if (name.contains("iPhone")){
//                click.click();
//                break;
//            }
//        }

//        Thread.sleep(5000);
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add to Cart\"));"));


//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add to Cart\"));"));

        Thread.sleep(3000);
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = (driver.manage().window().getSize().getHeight() * 4 / 5); // 80% from the top
        int endY = (driver.manage().window().getSize().getHeight() / 60);   // to scroll down increase the value

        TouchAction touchAction1 = new TouchAction(driver);
        touchAction1.press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
        WebElement addtocart = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[9]/android.view.View[27]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
        addtocart.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/cart_count")).click();


    }


}
