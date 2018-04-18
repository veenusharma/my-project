package com.hybridFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SigninPage {
       public WebDriver driver;
	    By userid = By.xpath("//*[@id='loginField']");
	    By password = By.id("passwordField");
	    By signin = By.linkText("Sign In");
	    By wrongpassword = By.xpath("//*[@class='msg-go-field']");
	  //  String wup= driver.findElement(wrongpassword).getText();
	    By createacct=By.xpath("//*[@class='dont-have-account']/a/span");
	    
	   public SigninPage(WebDriver driver) {
			this.driver =driver;
		}

	public LandingPage usd(String ud,String pd)
	{
		 driver.findElement(userid).sendKeys(ud);
		 driver.findElement(password).sendKeys(pd);
		 driver.findElement(signin).click();
		String wup= driver.findElement(wrongpassword).getText();
		System.out.println(wup);
		 if
			 (wup.equalsIgnoreCase("Your account has been locked because you've tried to sign in with an incorrect user ID and password too many times. Please reset your password. Having trouble? Please Visit our Help Center or call us at 1-800-288-2020."))
		
		 {
			 createAccount();
		 }
		 return new LandingPage(); 
	}

	
	
 public CreateDirectvAcctPage createAccount()
 {

 
driver.findElement(createacct).click();

return new CreateDirectvAcctPage(driver);

}
}