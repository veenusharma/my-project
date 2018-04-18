package com.hybridFramework.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.hybridFramework.pages.CreateDirectvAcctPage;
import com.hybridFramework.pages.LandingPage;
import com.hybridFramework.pages.LoginPage;
import com.hybridFramework.pages.SigninPage;
import com.hybridFramework.testBase.TestBase;

import com.hybridFramework.util.TestUtil;


public class CreateDirectvAcctTest extends TestBase{

	 WebDriver driver;
	 SigninPage sgn;
	 LoginPage lp;
	 LandingPage landingpage;
	 TestUtil testutil;
	 CreateDirectvAcctPage createdirectvacctpage;
	String sheetName ="userdata";
	// Object data[][]=null;
	 @BeforeMethod
	 public void setup() throws Exception
	 {
		driver=initializedriver();
		driver.get(pro.getProperty("url")); 
		sgn = new SigninPage(driver);
		createdirectvacctpage = new CreateDirectvAcctPage(driver);
		testutil= new TestUtil();
		lp = new LoginPage(driver);
	    lp.myacct();
		
	 }
	 @DataProvider
	 public Object[][] getdtvdata() 
	 {
	
		 Object data[][] = testutil.xssfDataSheet(sheetName);
	   return data;
	 }
	 
	
	@Test(dataProvider="getdtvdata")
	 public void createacct(String acountnumber, String phonenumber, String creditcard ,String lastname) throws InterruptedException
	 {
	    landingpage=sgn.usd(pro.getProperty("username"), pro.getProperty("password"));
		 String title=driver.getTitle();
		 System.out.println(title);
		// Thread.sleep(8L);
		createdirectvacctpage.createAcct(acountnumber, phonenumber, creditcard, lastname);
		 
		 
	 }
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
	 }
	 
	
}
