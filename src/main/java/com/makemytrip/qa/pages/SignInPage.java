package com.makemytrip.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.qa.base.TestBaseSetup;
import com.makemytrip.qa.pages.FlightsPage;

public class SignInPage extends TestBaseSetup {

	@FindBy(xpath = "//*[@id='ch_login_icon']/span[2]")
	WebElement ldrop;

	@FindBy(id = "ch_login_email")
	WebElement username;

	@FindBy(id = "ch_login_password")
	WebElement password;

	@FindBy(id = "ch_login_btn")
	WebElement loginbtn;

	@FindBy(xpath = "//*[@id='header_tab_flights']")
	WebElement flights;

	@FindBy(xpath = "//*[@id='header_tab_hotels']")
	WebElement hotels;
	
	@FindBy(xpath = "//*[@id='header_tab_holidays']")
	WebElement holidays;
	
	@FindBy(xpath = "//*[@id='header_tab_homestay']")
	WebElement homestays;
	
	@FindBy(xpath = "//*[@id='header_tab_bus']")
	WebElement bus;
	
	@FindBy(xpath = "//*[@id='header_tab_cabs']")
	WebElement cabs;
	
	@FindBy(xpath = "//*[@id='header_tab_gift-card']")
	WebElement giftcards;
	
	@FindBy(xpath = "//*[@id='ch_funnel_more']")
	WebElement moredropdown;

	// Initializing the Page Objects: VERY IMPORTANT
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickldrop() {

		ldrop.click();

	}

	
	
	public FlightsPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		// loginBtn.click();
		//Executing a click via JavaScript 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
		return new FlightsPage();
	}

	public FlightsPage clickOnFlights() {
		flights.click();
		return new FlightsPage();

	}

}
