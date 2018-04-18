package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WatchMovieOptionsPage {
 public WebDriver driver;
 
	By tvshows = By.linkText("TV Shows");
	
	By sports = By.linkText("Sports");
	
	By forkids = By.xpath("//*[@id='nav_item_5']/span/a");
	

 
	public WatchMovieOptionsPage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}

	public  String title()
	{
	return	driver.getTitle();
		
	}
	
	public TVShowsPage tvShowslink()
	{
		driver.findElement(tvshows).click();
		return new TVShowsPage();
	}
	public SportsPage sportslink()
	{
		driver.findElement(sports).click();
		return new SportsPage(driver);
	}
	
	public ForKidsPage forKids()
	{
		 driver.findElement(forkids).click();
		 return new ForKidsPage(driver);
	}
}
