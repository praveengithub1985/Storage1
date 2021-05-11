import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigateDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		//driver.get("F:/SeleniumRevisit/sampleHTML.html");
		driver.navigate().to("F:/SeleniumRevisit/sampleHTML.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();		
		Thread.sleep(3000);
		driver.navigate().forward();		
	}
}
