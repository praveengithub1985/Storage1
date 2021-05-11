package POM_Yahoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericTest 
{
	static WebDriver driver;
	@BeforeMethod
	public void startApp()
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		driver=new ChromeDriver();
	    driver.get("https://login.yahoo.com/?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com&pspid=97684142");
	    driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeApp()
	{
		System.out.println("Test done successfully");
		driver.quit();
	}
	
}
