package com.hybridFramework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hybridFramework.pages.TVShowsPage;
import com.hybridFramework.pages.WatchMovieOptionsPage;
import com.hybridFramework.pages.WatchmoviePage;
import com.hybridFramework.testBase.TestBase;



public class TvShowTest extends TestBase {
  public  WebDriver driver;
  WatchMovieOptionsPage wmo;
  WatchmoviePage mv;
  TVShowsPage tsp;
  By tvshows = By.linkText("TV Shows");
  
  @BeforeMethod
	public void setup() throws Exception
	{
		driver = initializedriver();
		driver.get(pro.getProperty("url"));
		wmo=new WatchMovieOptionsPage(driver);
		mv=new WatchmoviePage(driver);
		tsp= new TVShowsPage(driver);
		wmo= mv.hovermove();
		wmo.tvShowslink();
	}
  @Test(priority=1)
  public void showtvTest()
  {
	String title=tsp.gettitle(); 
	System.out.println(title);
	
  }
  @Test(priority=2)
  public void verifyTitleTest()
  {
	Assert.assertTrue(tsp.verifyTvshowTitle(), "TV Shows ");  
  }
  @AfterMethod
  public void teardown()
 {
	driver.quit();
 }
	
}
