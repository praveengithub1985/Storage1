import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CutCopyPasteUsingKeysEnumDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e1=driver.findElement(By.xpath("//input[@id='user']"));
		WebElement e2=driver.findElement(By.xpath("//input[@name='dob']"));
		Thread.sleep(2000);	
		e1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		e1.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		e2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		e2.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		e1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
	}
}
