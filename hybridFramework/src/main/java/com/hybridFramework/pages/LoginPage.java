package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage  {
 public WebDriver driver;
	By myAccount = By.linkText("My Account");
	
   By logo = By.xpath("//*[@id='dtv_logo']/span");
   By createaccount = By.xpath("//*[@class='create-acc']");
    
 public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

public  SigninPage myacct()
 {
	
  driver.findElement(myAccount).click();
  return new  SigninPage(driver);
  
 }
   
 

public String validatepagetitle() {
	 return driver.getTitle();
 }
  
 public boolean validatelogo() {
	WebElement lg = driver.findElement(logo);
	return lg.isDisplayed();
 }
 

}
 
