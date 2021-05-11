import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.quit();
	}
}
