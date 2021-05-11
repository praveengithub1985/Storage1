import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSEScrollToElement 
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
		String domain=js.executeScript("return document.domain").toString();
		System.out.println(domain);
		Thread.sleep(2000);	
		WebElement e=driver.findElement(By.xpath("//a[.='More News']"));
		Point p=e.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(p);
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);	
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
		e.click();
	}
}
