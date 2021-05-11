import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelJavaArchitecture 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.close(); //Contains 46 public methods
		WebDriver driver2=new FirefoxDriver();
		driver2.quit(); //Contains only 13 abstract methods 
		RemoteWebDriver driver3=new FirefoxDriver();
		driver3.close(); //Contains 46 public methods
		SearchContext driver4=new FirefoxDriver();
		driver4.findElement(); //Contains only 2 abstract methods 
	}
}
