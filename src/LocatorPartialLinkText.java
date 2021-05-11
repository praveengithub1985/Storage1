import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorPartialLinkText
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("ass")).click();		
	}
}
