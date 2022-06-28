package com.realezy.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.realezy.qa.base.BaseClass;
import com.realezy.qa.pages.HomePage;
import com.realezy.qa.pages.LoginPage;

public class LoginTestCase extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;

	public LoginTestCase() {
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginPageInputErrorTest() throws InterruptedException
	{
		String errorText = loginPage.validateEmailInputError();
		Thread.sleep(1000);
		ExtentTest test1 = extent.createTest("Validate Input Error");
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		if(errorText.equals("Please enter valid email"))
		{
			test1.log(Status.PASS, "Validate Input Error Succesfully");
			test1.pass("InputError test is verified");
		}else
		{
			test1.log(Status.FAIL, "Validate Input Error Succesfully");
			test1.fail("Validate Input Error is varified");
		}
		
	}

	@Test(priority = 2)
	public void LoginTest() throws InterruptedException
	{
		ExtentTest test2 = extent.createTest("Validate Succesful Login");
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		if(loginPage.login("rzy4@gmail.com", "123456")==true)
		{
			test2.log(Status.PASS, "User Loged in Succesfully");
			test2.pass("User Loged in test is verified");
		}
		
		
	}

	@AfterMethod
	public void teardown()
	{
		extent.flush();
		driver.quit();
	}

}
