import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementReferenceExceptionDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		WebElement e=driver.findElement(By.xpath("//input[@id='user']"));
		Thread.sleep(2000);
		e.clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
		e.sendKeys("Hi");
	}
}
