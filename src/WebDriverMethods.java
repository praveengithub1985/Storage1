import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		String title=driver.getTitle();
		System.out.println("===================");
		System.out.println(title);
		System.out.println("===================");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("===================");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
}
