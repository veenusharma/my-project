package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TVShowsPage {
   
	public WebDriver driver;
	By tvshow = By.linkText("TV Shows");
	
	public TVShowsPage(WebDriver driver) {
    this.driver=driver;
	}
	
	public TVShowsPage() {
		// TODO Auto-generated constructor stub
	}

	public String gettitle()
	{
		return driver.getTitle();
	}
	public boolean verifyTvshowTitle()
	{
	 return driver.findElement(tvshow).isDisplayed();
	 
	}
	
	@AfterMethod
	  public void teardown()
	 {
		driver.quit();
	 }
}
