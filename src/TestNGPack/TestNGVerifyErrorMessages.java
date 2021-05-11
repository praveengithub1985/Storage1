package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGVerifyErrorMessages 
{
	WebDriver driver;
	@BeforeMethod
	public void startApp()
	{
		String key="webdriver.chrome.driver";
		String value="F:\\SeleniumRevisit\\SeleniumTraining\\Drivers\\chromedriver.exe";
		System.setProperty(key,value);
		driver=new ChromeDriver();
		System.out.println("==========Browser Launched===========");
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
	}
		
	@Test (description="Using AssertEquals() and GetText()")
	public void test1()
	{
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		String actual=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		String expected="Enter an email or phone numbe";
		Assert.assertEquals(actual,expected,"Verification Failed");
		System.out.println("Error Message Verified using getText()");
	}
	
	@Test (description="Using AssertTrue() and GetText()")
	public void test2()
	{
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		String actual=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		Assert.assertTrue(actual.contains(" or "),"Verification Failed");
		System.out.println("Error Message Verified using assertTrue");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("==========Browser Closed=============");
	}
	
	
}
