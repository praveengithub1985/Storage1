import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompletelyDynamicElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("https://sites.google.com/site/httpwwwseleniumhqorg/download");		
		driver.findElement(By.xpath("//td[.='Python']/../td[4]/a")).click();
	}
}
