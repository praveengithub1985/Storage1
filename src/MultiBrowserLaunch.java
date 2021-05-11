import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserLaunch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key1="webdriver.gecko.driver";
		String value1="./Drivers/geckodriver.exe";
		System.setProperty(key1,value1);
		FirefoxDriver driver1=new FirefoxDriver();
		
		String key2="webdriver.chrome.driver";
		String value2="./Drivers/chromedriver.exe";
		System.setProperty(key2,value2);
		ChromeDriver driver2=new ChromeDriver();
		
		Thread.sleep(5000);
		driver1.quit();
		driver2.quit();
	}
}
