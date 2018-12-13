package com.makemytrip.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

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

public class FlightsPageTest extends TestBaseSetup {

	WebDriver driver;
	SignInPage signinPage;
	FlightsPage flightPage;

	public FlightsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("chrome");
		switchtoframe();
		signinPage = new SignInPage();
		flightPage = signinPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void goToFlights()  {
		flightPage.enterplaces(prop.getProperty("frompl"), prop.getProperty("topl"));
		flightPage.clickOnSearch();
	     }
	
	
	

	
		
		

	}


