package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;

public class CreateDirectvAcctPage {
 
	WebDriver driver;
	By accountnumber = By.id("accountNumber");
	@CacheLookup
	By phonenumber = By.id("phoneNumber");
	By creditcrd= By.id("ccn4");
	By lastname=By.id("lastName");
	By continuebutton = By.xpath("//div[@class='btnRow']/a");
	
	public CreateDirectvAcctPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public Accountcreated createAcct(String acountnumber,String phonenumber2,String creditcard,String lstnm){
		driver.findElement(accountnumber).sendKeys(acountnumber);
		driver.findElement(phonenumber).sendKeys(phonenumber2);
		driver.findElement(creditcrd).sendKeys(creditcard);
		driver.findElement(lastname).sendKeys(lstnm);
		driver.findElement(continuebutton).click();
		return new Accountcreated();
	}

	
}
