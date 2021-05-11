package TestNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTitleVerificationHA 
{
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		String key="webdriver.chrome.driver";
		String value="F:\\SeleniumRevisit\\SeleniumTraining\\Drivers\\chromedriver.exe";
		System.setProperty(key,value);
		driver=new ChromeDriver();
		System.out.println("==========Browser Launched===========");
	}
	
	@Test (priority=0,description="Case for comparison of complete title")
	public void assertEquals()
	{		
		driver.get("https://www.onlinesbi.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="State Bank of india";
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Title Verified");
		driver.close();
	}
	
	@Test (priority=1,description="Case for comparison with contains")
	public void assertTrue()
	{
		driver.get("https://www.onlinesbi.com/");
		String actualTitle=driver.getTitle();
		//String expectedTitle="State Bank of India";
		Assert.assertTrue(actualTitle.contains("State"));
		System.out.println("Title Verified");		
	}
	
	@Test (priority=2,description="Case for comparison from page source")
	public void assertTruePS()
	{
		driver.get("https://www.onlinesbi.com/");
		String actualTitle=driver.getPageSource();
		//String expectedTitle="State Bank of India";
		Assert.assertTrue(actualTitle.contains("State"));
		System.out.println("Title Verified");		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("==========Browser Closed===========");
	}
}
