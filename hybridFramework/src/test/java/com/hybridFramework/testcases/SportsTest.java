package com.hybridFramework.testcases;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hybridFramework.pages.SportsPage;
import com.hybridFramework.pages.WatchMovieOptionsPage;
import com.hybridFramework.pages.WatchmoviePage;
import com.hybridFramework.testBase.TestBase;

public class SportsTest extends TestBase {
  WebDriver driver;
  SportsPage sp;
  WatchMovieOptionsPage wmo;
  WatchmoviePage mv;
  
  @BeforeMethod
  public void setup() throws Exception
  {
	  driver= initializedriver();
	  driver.get(pro.getProperty("url"));
	  sp = new SportsPage(driver);
	  wmo=new WatchMovieOptionsPage(driver);
		mv=new WatchmoviePage(driver);
		mv.hovermove();
		wmo.sportslink();
	  
  }
  
	@Test
	public void verifytitle1()
	{
	String title=sp.getTitle();
	
		System.out.println(title);
	}
	
	@Test
	public void verifytitletext()
	{
		sp.getlink();
		Assert.assertTrue(sp.getlink(),"Sports & Live Events");
	}
	@AfterMethod
	  public void teardown()
	 {
		driver.quit();
	 }
}
