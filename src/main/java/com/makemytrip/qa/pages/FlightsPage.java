package com.makemytrip.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.qa.base.TestBaseSetup;
import com.makemytrip.qa.pages.SignInPage;

public class FlightsPage extends TestBaseSetup {

	
	
	
	
	@FindBy(xpath = "//*[@id='hp-widget__sfrom']")
	WebElement fromplace;
	
	@FindBy(xpath = "//*[@id='hp-widget__sTo']")
	WebElement toplace;
	
	@FindBy(xpath = "//*[@id='searchBtn']")
	WebElement searchbtn;
	
	// Initializing the Page Objects:
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void enterplaces(String fp, String tp) {
		fromplace.sendKeys(fp);
		toplace.sendKeys(tp);
	}

	public void clickOnSearch() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", searchbtn);
		
		

	}

}
