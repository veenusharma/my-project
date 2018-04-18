package com.hybridFramework.testcases;




import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hybridFramework.pages.WatchMovieOptionsPage;
import com.hybridFramework.pages.WatchmoviePage;
import com.hybridFramework.testBase.TestBase;



public class mhovermovieTest extends TestBase {

	WebDriver driver;
	WatchmoviePage mv;
	WatchMovieOptionsPage wmo;
	@BeforeMethod
	public void setup() throws Exception
	{
		driver = initializedriver();
		driver.get(pro.getProperty("url"));
		wmo=new WatchMovieOptionsPage(driver);
		mv=new WatchmoviePage(driver);
		wmo= mv.hovermove();
	}

	
	/*@Test
	public void hovertomovieTest() throws Exception
	{
		
		wmo= mv.hovermove();
	}*/
	
	@Test(priority=1)
	public void verifywtachlinkTitleTest()
	{
	  String title=wmo.title();
	  Assert.assertEquals(title, "Watch Movies Online | Stream Movies On Demand | DIRECTV");
	  System.out.println(title);
	  
	  
	}
	@Test(priority=2)
	public void tvshowsTest()
	{
		wmo.tvShowslink();
	}
  @Test(priority=3)
  public void sportsTest()
  {
	 wmo.sportslink();
  }
  @Test(priority=4)
  public void forkidsTest()
  {
	  wmo.forKids();
  }
 
  @AfterMethod
   public void teardown()
  {
	driver.quit();
  }
	
	
}
