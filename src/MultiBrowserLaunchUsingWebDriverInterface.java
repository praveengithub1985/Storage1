import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserLaunchUsingWebDriverInterface 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key1="webdriver.gecko.driver";
		String value1="./Drivers/geckodriver.exe";
		System.setProperty(key1,value1);
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);	
		driver.quit();
		
		String key2="webdriver.chrome.driver";
		String value2="./Drivers/chromedriver.exe";
		System.setProperty(key2,value2);
		driver=new ChromeDriver();		
		Thread.sleep(2000);	
		driver.quit();
	}
}
