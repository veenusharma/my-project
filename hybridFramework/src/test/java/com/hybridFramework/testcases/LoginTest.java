package com.hybridFramework.testcases;


import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hybridFramework.pages.LandingPage;
import com.hybridFramework.pages.LoginPage;
import com.hybridFramework.pages.SigninPage;
import com.hybridFramework.testBase.TestBase;


//@Listeners(com.hybridFramework.util.Listener.class)
 public class LoginTest extends TestBase {
	public WebDriver driver;
	 
	LandingPage landingpage;
	SigninPage sn;
	LoginPage lp;
	@BeforeMethod
	public void setup() throws Exception
	{
	 driver = initializedriver();
	  sn = new SigninPage(driver);
	  lp = new LoginPage(driver);
	 driver.get(pro.getProperty("url")); 
	 
	 
	}	
	@Test(priority=1)
	 public void loginpageTitleTest() throws IOException, Exception
	 
	 {
		
	//	LoginPage lp = new LoginPage(driver);
        String title=  lp.validatepagetitle();
       Assert.assertEquals(title, "DIRECTV Official Site | New $355 TV Deal!");
       
        System.out.println(title);
       
         }
	
	
	@Test(priority=2)
	public void validateLogoTest()
	{
		
	//LoginPage lp = new LoginPage(driver);
	boolean flg=lp.validatelogo();
	Assert.assertTrue(flg);
	}
	
	
	@Test(priority=3)
	public void logintest()
	{
		// Signin sn = new Signin(driver);
		 //LoginPage lp = new LoginPage(driver);
		 lp.myacct();
		
		 landingpage=sn.usd(pro.getProperty("username"), pro.getProperty("password"));
	}
	
	
	@AfterMethod
	

		public void tearDown()
		{
			driver.quit();
		}
	

}
