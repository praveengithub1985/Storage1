package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleHTML_Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		SampleHTML_POM s=new SampleHTML_POM(driver);
		Thread.sleep(2000);
		s.clearUsername();
		Thread.sleep(2000);
		s.sendUsername("Stale");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		s.clearUsername();
		Thread.sleep(2000);
		s.sendUsername("POM");
		Thread.sleep(2000);
		driver.quit();
	}
}
