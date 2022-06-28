package com.realezy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.realezy.qa.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseClass{

	PageObjects loginPage;
	String userName = prop.getProperty("username");
	String passWord = prop.getProperty("123456");

	class PageObjects {
		// pageObjects
		
		@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")
		public WebElement userEmailElement;
		
		@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")
		public WebElement userPasswordElement;
		
		@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]")
		public WebElement loginbtnElement;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Please enter valid email address\"]")
		public WebElement emailinputError;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Please enter password\"]")
		public WebElement passinputError;
	}
	/*
	//driver initialization
	public LoginPage(AppiumDriver<WebElement> driver) {
		loginPage = new PageObjects();
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPage);
	}
	*/
	public LoginPage()
	{
		loginPage = new PageObjects();
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPage);
	}

	//Actions
	public boolean validateLoginpage() {
		boolean elements = false;
		if (loginPage.userEmailElement.isDisplayed()) {
			if (loginPage.userPasswordElement.isDisplayed()) {
				if (loginPage.loginbtnElement.isDisplayed()) {

					elements = true;

				}
			}
		} else {
			elements = false;
		}
		return elements;

	}

		public String validateEmailInputError() throws InterruptedException
		{
			loginPage.loginbtnElement.click();
			Thread.sleep(2000);
			String errString = loginPage.emailinputError.getAttribute("content-desc");
			Thread.sleep(1000);
			return errString;
		}
		
		public boolean login(String un, String pass) throws InterruptedException
		{
			loginPage.userEmailElement.click();
			Thread.sleep(1000);
			loginPage.userEmailElement.sendKeys(un);
			Thread.sleep(1000);
			loginPage.userPasswordElement.click();
			Thread.sleep(1000);
			loginPage.userPasswordElement.sendKeys(pass);
			Thread.sleep(1000);
			loginPage.loginbtnElement.click();
			return true;
			
		}
	

}
