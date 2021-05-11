import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSEOtherCommands 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key2="webdriver.chrome.driver";
		String value2="./Drivers/chromedriver.exe";
		System.setProperty(key2,value2);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);	
		js.executeScript("window.history.go(0)");
		//WebElement e=driver.findElement(By.xpath("//a[.='More News']"));
		String eText=js.executeScript("return document.getElementById('aid').innerHTML").toString();
		System.out.println(eText);
		Thread.sleep(2000);
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		Thread.sleep(2000);		
		js.executeScript("alert('Praveen Alert')");	
	}
}
