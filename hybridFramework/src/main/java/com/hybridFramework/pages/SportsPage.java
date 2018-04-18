package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class SportsPage {

	WebDriver driver;
	
	
	//By sports = By.linkText("Sports & Live Events");
	By sports = By.xpath("//*[@id='dtv_main']/div[2]/div/div/h2");
	public SportsPage(WebDriver driver) {
		this.driver=driver;
	}

	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean getlink()
	{
	return driver.findElement(sports).isDisplayed();
		
	}
}
