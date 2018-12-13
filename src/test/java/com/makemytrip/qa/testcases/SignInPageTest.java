package com.makemytrip.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.makemytrip.qa.base.TestBaseSetup;
import com.makemytrip.qa.pages.FlightsPage;
import com.makemytrip.qa.pages.SignInPage;

public class SignInPageTest extends TestBaseSetup {

	SignInPage signinPage;
	FlightsPage flightsPage;

	public SignInPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("chrome");
		//switchtoframe();
		signinPage = new SignInPage();
		}

	@Test

	public void loginTest() {
		signinPage.clickldrop();
		flightsPage=signinPage.login(prop.getProperty("uname"), prop.getProperty("pswd"));
		
	}
	
	@AfterMethod
	public void cbrowser(){
		driver.quit();
		
	}

}