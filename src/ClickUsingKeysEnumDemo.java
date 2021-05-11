import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickUsingKeysEnumDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//a[@class='c1']"));		
		Thread.sleep(2000);	
		e.sendKeys(Keys.ENTER);		
	}
}
