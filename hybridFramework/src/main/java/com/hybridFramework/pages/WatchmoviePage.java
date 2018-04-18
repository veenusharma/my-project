package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class WatchmoviePage {
  
	WebDriver driver;
	
	By watch=By.linkText("Watch");
	 
	By movies=By.linkText("Movies");
	
	
	public WatchmoviePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement watchclick()
	{
	 return driver.findElement(watch);
	}
	
	public WebElement movey()
	{
		return driver.findElement(movies);
	}
	public WatchMovieOptionsPage hovermove()
	{
		WebElement sub=	driver.findElement(By.xpath("//*[text()='Watch']/parent::*"));
		WebElement mov=	driver.findElement(By.xpath("//*[@id=\'dtv_topnav_util\']/div[4]/div/ul/li[2]/a"));
	    Actions a = new Actions(driver);
	    a.moveToElement(sub).clickAndHold().moveToElement(mov).click().release().perform();
	    
	    return new WatchMovieOptionsPage(driver);
		
	}
	
}
