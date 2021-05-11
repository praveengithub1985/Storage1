package TestNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGCrossBrowser 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void startBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			String key="webdriver.gecko.driver";
			String value="F:\\SeleniumRevisit\\SeleniumTraining\\Drivers\\geckodriver.exe";
			System.setProperty(key,value);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println(browserName+" Launched");
		}
		else
		{
			String key="webdriver.chrome.driver";
			String value="F:\\SeleniumRevisit\\SeleniumTraining\\Drivers\\chromedriver.exe";
			System.setProperty(key,value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println(browserName+" Launched");
		}		
	}
	
	@Test (description="Case for comparison of complete title")
	public void assertEquals() throws InterruptedException
	{		
		driver.get("https://www.onlinesbi.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="State Bank of India";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);		
		System.out.println("Title Verified");
		//Thread.sleep(10000);
		sa.assertAll();			
	}	
	
	@Parameters("browser")
	@AfterMethod
	public void closeBrowser(String browserName)
	{
		System.out.println(browserName+" Closed");
		driver.quit();		
	}
}
