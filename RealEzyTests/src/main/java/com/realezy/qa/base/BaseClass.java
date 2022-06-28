package com.realezy.qa.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
	protected static AppiumDriver<WebElement> driver;
	public static String projectpath;
	public static Properties prop;
	public static ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	public static ExtentReports extent = new ExtentReports();

	public BaseClass() {
		projectpath = System.getProperty("user.dir");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					projectpath + "/src/main/java/com/realezy" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		// directory where output is to be printed
	
		extent.attachReporter(spark);

		// for App setup
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			// dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability("platformName", "android");
			dc.setCapability("deviceName", "emulator-5554");
			// dc.setCapability("platformVersion", "10QP1A.190711.020");
			dc.setCapability("appPackage", "com.realezy.app");
			dc.setCapability("appWaitActivity", "com.realezy.app.MainActivity");
			projectpath = System.getProperty("user.dir");
			// dc.setCapability("app", projectpath +
			// "/src/test/resources/apps/RZY_16_06.apk");
			dc.setCapability("app", "C:\\Dev\\Appium\\RZY_16_06.apk");
			dc.setCapability("autoGrantPermissions", "true");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<WebElement>(url, dc);

			// IOSDriver<IOSElement>driver2 = new IOSDriver<IOSElement>(new
			// URL("http://127.0.0.1:4733/wd/hub"), dc);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message" + e.getMessage());
			e.printStackTrace();
		}
	}

}
