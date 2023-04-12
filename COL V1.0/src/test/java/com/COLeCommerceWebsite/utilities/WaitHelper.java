package com.COLeCommerceWebsite.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public WebDriver driver;
	//Constructor
	public WaitHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	//Wait till the WebElement is available on the page - For Explicit waits
	public void waitForElement(WebElement element, Duration i)
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//Implicit Wait
	public void waitForPageLoad (Duration i) throws InterruptedException
	{
		WebDriverWait wait1 = new WebDriverWait (driver, i);
		wait1.wait(1000);
	}
	public void waitForElement(WebElement amazonLogoLink, int i) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
