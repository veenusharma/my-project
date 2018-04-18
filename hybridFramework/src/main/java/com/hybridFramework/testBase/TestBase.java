package com.hybridFramework.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class TestBase {

	public static WebDriver driver;
	public Properties pro;
	
	 public TestBase()
	 {
		 try {
			  pro=new Properties();
			 FileInputStream fis=new FileInputStream("C:\\Users\\sharmava\\eclipse-workspace\\hybridFramework\\src\\main\\java\\com\\hybridFramework\\config\\config.properties");
			pro.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	 }
	public WebDriver initializedriver() throws IOException
	{
		
		
		String browserName=pro.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			
		else if (browserName.equalsIgnoreCase("firefox"))
				{
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
			
				}
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get(pro.getProperty("url"));
	     return driver;
	     
}
	
	public static void getScreenshot(String result) throws IOException
	{
	  File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//  FileUtils.copyFile(src, new File("C:\\Users\\sharmava\\screenshot"+result+ ".png"));
	  
	  FileUtils.copyFile(src, new File(("user.dir")+"/test-output/"+result+ ".png"));
	}
	


}
