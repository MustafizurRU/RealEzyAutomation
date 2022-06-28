package com.realezy.qa.testcases;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Lists;
import java.awt.*;
import java.io.File; 
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class test {
	 static WebDriverWait wait;
	 static String fileName = "Room1";
	 private ScreenRecorder screenRecorder;
	public static void main(String[] args) throws Exception {
		test  videoReord = new test();
        videoReord.startRecording(); 
        
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("appPackage", "com.realezy.app");
		dc.setCapability("appWaitActivity", "com.realezy.app.MainActivity");
		dc.setCapability("app", "C:\\Dev\\Appium\\RZY_16_06.apk");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		wait = new WebDriverWait(driver, 10);
        driver.setFileDetector(new LocalFileDetector());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
		el1.click();
		driver.hideKeyboard();
		Thread.sleep(1000);
		el1.sendKeys("rzy4@gmail.com");
		Thread.sleep(1000);
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
		el2.click();
		driver.hideKeyboard();
		Thread.sleep(1000);
		el2.sendKeys("123456");
		Thread.sleep(1000);
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
		el3.click();
		Thread.sleep(1000);
		MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Open navigation menu\"]");
		el4.click();
		Thread.sleep(1000);
		MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Property Easy Listing\"]");
		el5.click();
		Thread.sleep(1000);
		MobileElement el6 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Whole Unit\"]");
		el6.click();
		Thread.sleep(1000);
		MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Landed\"]");
		el7.click();
		Thread.sleep(1000);
		MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next\"]");
		el8.click();
		Thread.sleep(1000);
		
		
	
		
		
		MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Photo/Video\"]");
		el9.click();
		Thread.sleep(1000);
		MobileElement el10 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Upload From Gallery\"]");
		el10.click();
		Thread.sleep(1000);
		
		//File Upload
		driver.pushFile("/sdcard/Download/room.jpeg", new File("C:\\Users\\musta\\Downloads\\roomImage\\room.jpeg"));
		Thread.sleep(1000);
		//Switch to Native_App
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }

        Thread.sleep(1000);
        
        
        //Click on 'Allow' - permission
        By elementView = By.id("com.android.permissioncontroller:id/permission_allow_button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementView));
        driver.findElement(elementView).click();
        Thread.sleep(1000);
        
        
        //select pdf file from downloads (location of pdf file)
        By eleDoc = By.id("android:id/title");
        wait.until(ExpectedConditions.visibilityOfElementLocated(eleDoc));
        driver.findElement(eleDoc).click();
        Thread.sleep(1000);
        
        //Switch to RealEzyApp
        Set<String> contextNames1 = driver.getContextHandles();
        for (String strContextName : contextNames1) {
            if (strContextName.contains("RealEzy")) {
                driver.context("RealEzy");
                break;
            }
        }
        Thread.sleep(5000);
        
        MobileElement el222 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
        el222.click();
        driver.hideKeyboard();
        Thread.sleep(1000);
        el222.sendKeys("Palacia2");
        driver.hideKeyboard();
        Thread.sleep(000);
        
        MobileElement el188 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
        el188.click();
        driver.hideKeyboard();
        Thread.sleep(1000);
        el188.sendKeys("12036");
        driver.hideKeyboard();
        Thread.sleep(2000);
        
        MobileElement el444 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"District:\"]");
        el444.click();
        Thread.sleep(1000);
        MobileElement el544 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"D02 Chinatown / Tanjong Pagar\"]");
        el544.click();
        Thread.sleep(1000);
        
        MobileElement el644 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
        el644.click();
        driver.hideKeyboard();
        Thread.sleep(1000);
        el644.sendKeys("109 Masjid Road");
        driver.hideKeyboard();
        Thread.sleep(1000);
    
        MobileElement el266 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");
        el266.click();
        driver.hideKeyboard();
        Thread.sleep(1000);
        el266.sendKeys("3000");
        driver.hideKeyboard();
        Thread.sleep(1000);
        
        MobileElement el177 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]");
        el177.click();
        driver.hideKeyboard();
        Thread.sleep(1000);      
        el177.sendKeys("2000");
        driver.hideKeyboard();
        Thread.sleep(1000);

      
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new� � UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().(\"WebView\").instance(0))");
       
        MobileElement el944 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]");
        el944.click();
        Thread.sleep(1000);
        MobileElement el1a = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Switch to input\"]");
        el1a.click();
        
        Thread.sleep(1000);
    	
        
      
        MobileElement el2a = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@index=\"1\"]");
        Thread.sleep(1000);
        el2a.sendKeys("6/27/2022");
        Thread.sleep(1000);
        
        Thread.sleep(1000);
        MobileElement el3a = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"OK\"]");
        el3a.click();
        Thread.sleep(1000);
        driver.hideKeyboard();
        Thread.sleep(3000);

        //Ok
        
        
        
        
        MobileElement el3att = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Bed Room:\"]");
        el3att.click();
        Thread.sleep(1000);
        MobileElement el13 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Cluster House\"]");
        el13.click();
      
        Thread.sleep(1000);
        MobileElement el14 = (MobileElement) driver.findElementByXPath("(//android.widget.Button[@content-desc=\"4\"])[1]");
        el14.click();
        Thread.sleep(1000);
        MobileElement el15 = (MobileElement) driver.findElementByXPath("(//android.widget.Button[@content-desc=\"5+\"])[2]");
        el15.click();
        Thread.sleep(1000);
        
        MobileElement el2ab = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.Button");
        el2ab.click();
        Thread.sleep(1000);
        
        MobileElement el16 = (MobileElement) driver.findElementByXPath("(//android.widget.Button[@content-desc=\"2\"])[2]");
        el16.click();
        Thread.sleep(1000);
        MobileElement el2ad = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Unfurnished\"]");
        el2ad.click();
        Thread.sleep(1000);
        MobileElement el3ad = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Mid\"]");
        el3ad.click();
        Thread.sleep(1000);
        MobileElement el5dd = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.Button");
        el5dd.click();
        Thread.sleep(1000);
        MobileElement el4dd = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Lake View\"]");
        el4dd.click();
        Thread.sleep(1000);
        
        

        Thread.sleep(1000);
        MobileElement el17 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Air-Condition\"]");
        el17.click();
        Thread.sleep(1000);
        MobileElement el18 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Garage\"]");
        el18.click();
        Thread.sleep(1000);
        MobileElement el19 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Water Heater\"]");
        el19.click();
        Thread.sleep(1000);
        
        MobileElement el2ww = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.Button");
        el2ww.click();
        Thread.sleep(1000);
       
        MobileElement el22 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Covered Linkways\"]");
        el22.click();
        Thread.sleep(1000);
        MobileElement el23 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Function Room\"]");
        el23.click();
        Thread.sleep(1000);
        MobileElement el24 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Gymnasium Room\"]");
        el24.click();
        Thread.sleep(1000);
        MobileElement el25 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Club House\"]");
        el25.click();
        Thread.sleep(1000);
        
        
        //ok tik
        MobileElement el1tt = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button[2]");
        el1tt.click();
        Thread.sleep(1000);
        driver.hideKeyboard();
        
        Thread.sleep(3000);
      	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"Yes\").instance(0))");
      	Thread.sleep(3000);
        
       
        MobileElement el36 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Yes\"]");
		el36.click();
        
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Description\").instance(0))");
		Thread.sleep(1000);
        MobileElement el28 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"MRT List\"]");
        el28.click();
        
        //OK
        Thread.sleep(1000);
        MobileElement el2hh = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");
        el2hh.click();
        Thread.sleep(1000);
        MobileElement el2hh3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
        el2hh3.click();
        
        el2hh3.sendKeys("Aljunied");
        Thread.sleep(1000);
        driver.hideKeyboard();
        Thread.sleep(1000);
        MobileElement el4kk = (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@index=\"0\"]");
        el4kk.click();
        
        //
        el2hh3.click();
        el2hh3.sendKeys("Bartley");
        Thread.sleep(1000);
        driver.hideKeyboard();
        Thread.sleep(1000);
        MobileElement el4kk2 = (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@index=\"0\"]");
        el4kk2.click();
        
        //
        el2hh3.click();
        el2hh3.sendKeys("Bishan");
        Thread.sleep(1000);
        driver.hideKeyboard();
        Thread.sleep(1000);
        MobileElement el4kk23 = (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@index=\"0\"]");
        el4kk23.click();
        
        Thread.sleep(1000);
        MobileElement el5ll = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Ok\"]");
        el5ll.click();
        Thread.sleep(1000);
        driver.hideKeyboard();
        Thread.sleep(1000);
        
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Description\").instance(0))");
        Thread.sleep(1000);
        MobileElement el6pp = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
        el6pp.click();
        Thread.sleep(1000);
        el6pp.sendKeys("Before we step forward, it�s important to understand that this is a simple example using Android Emulator version 10. Please check that the locators may differ on your device based on the version selected.");
        Thread.sleep(1000);
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Description\").instance(0))");
        //Thread.sleep(1000);
        driver.hideKeyboard();
        Thread.sleep(1000);
        
        //OK
      
		
        
		
		
        MobileElement el1qq = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]");
        el1qq.click();
        Thread.sleep(1000);
        MobileElement el33 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Upload Document (Photo/PDF)\"]");
        el33.click();
    	Thread.sleep(1000);
    	//File Upload
    	driver.pushFile("/sdcard/Download/sample.pdf", new File("C:\\Users\\musta\\Downloads\\roomImage\\sample.pdf"));
    	
		//Switch to Native_App
        Set<String> contextNames2 = driver.getContextHandles();
        for (String strContextName2 : contextNames2) {
            if (strContextName2.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        Thread.sleep(1000);
        //select pdf file from downloads (location of pdf file)
        //com.google.android.documentsui:id/icon_thumb
        
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"sample.pdf\").instance(0))").click();
       /*
        By eleDoc2 = By.id("android:id/title");
        wait.until(ExpectedConditions.visibilityOfElementLocated(eleDoc2));
        driver.findElement(eleDoc2).click();
        Thread.sleep(1000);
        */
        
        Thread.sleep(1000);
        //Switch to RealEzy
        Set<String> contextNames3 = driver.getContextHandles();
        for (String strContextName3 : contextNames3) {
            if (strContextName3.contains("RealEzy")) {
                driver.context("RealEzy");
                break;
            }
        }
        Thread.sleep(5000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"Download POI for Free\").instance(0))");
      	Thread.sleep(2000);
        
        MobileElement el356 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@index=\"3\"]");
        el356.click();
        Thread.sleep(1000);
        System.out.println("Successfully added Property");
        Thread.sleep(5000);
        videoReord.stopRecording();

	}
	public void startRecording() throws Exception
    {    
           File file = new File("C:\\Users\\musta\\Videos");
                        
           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
           int width = screenSize.width;
           int height = screenSize.height;
                         
           Rectangle captureSize = new Rectangle(0,0, width, height);
                         
         GraphicsConfiguration gc = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getDefaultScreenDevice()
            .getDefaultConfiguration();

        this.screenRecorder = new SpecializedScreenRecorder(gc, captureSize,
            new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
            new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                 CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                 DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                 QualityKey, 1.0f,
                 KeyFrameIntervalKey, 15 * 60),
            new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                 FrameRateKey, Rational.valueOf(30)),
            null, file, "MyVideo");
       this.screenRecorder.start();
   
    }

    public void stopRecording() throws Exception
    {
      this.screenRecorder.stop();
    }
}
