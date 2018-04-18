package com.hybridFramework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hybridFramework.pages.ForKidsPage;
import com.hybridFramework.pages.WatchMovieOptionsPage;
import com.hybridFramework.pages.WatchmoviePage;
import com.hybridFramework.testBase.TestBase;

public class Kidstest extends TestBase{
	WebDriver driver;
	  ForKidsPage kp;
	  WatchMovieOptionsPage wmo;
	  WatchmoviePage mv;
	  
	  @BeforeMethod
	  public void setup() throws Exception
	  {
		  driver= initializedriver();
		  driver.get(pro.getProperty("url"));
		  kp = new ForKidsPage(driver);
		  wmo=new WatchMovieOptionsPage(driver);
			mv=new WatchmoviePage(driver);
			mv.hovermove();
	
			wmo.forKids();
			
		  
	  }

	  @Test
	  public void verifytitle()
	  {
		String title= kp.gettitle();
		System.out.println(title);
	
	  }
	  @Test
	  public void verifyKidsTitle()
	  {
		  kp.verfiyTitel();
		  Assert.assertTrue(kp.verfiyTitel(), "For Kids");
		  
	  }
	  @AfterMethod
	  public void teardown()
	 {
		driver.quit();
	 }
}
