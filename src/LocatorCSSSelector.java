import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorCSSSelector
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Sachin");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[name='dob']")).sendKeys("April 1985");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input#male")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input.pclass")).sendKeys("pass");
	}
}
