import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSEHistory 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key2="webdriver.chrome.driver";
		String value2="./Drivers/chromedriver.exe";
		System.setProperty(key2,value2);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//a[.='More News']"));
		e.click();
		Thread.sleep(10000);		
		WebElement rsa=driver.findElement(By.xpath("//a[.='Sai Mukkamalla and Skanda Sharma blaze away with memorable tons']"));
		rsa.click();
		Thread.sleep(10000);
		js.executeScript("history.go(-1)");
		Thread.sleep(10000);
		js.executeScript("history.go(1)");
		Thread.sleep(10000);
		js.executeScript("history.go(-2)");		
	}
}
