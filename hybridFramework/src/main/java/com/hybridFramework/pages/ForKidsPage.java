package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForKidsPage {

	 WebDriver driver;
//	By kids = By.linkText("For Kids");
	 By kids =By.xpath("//*[@id='dtv_main']/div[2]/div/div/h2");
	 
	 public ForKidsPage(WebDriver driver) {
		this.driver=driver;
	}

	
	public String gettitle()
	 {
		return driver.getTitle();
	 }
	 
	 public boolean verfiyTitel()
	 {
		return driver.findElement(kids).isDisplayed();
	 }
	 
}
