import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).sendKeys("Praveen");
		Thread.sleep(1500);
		driver.findElement(By.id("pid")).sendKeys("Pra_Kum@85");
		Thread.sleep(1500);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("c1")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("c2")).click();
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).sendKeys("Sachin");
		Thread.sleep(1500);
		driver.findElement(By.id("female")).click();
		Thread.sleep(1500);		
		driver.findElement(By.className("c1")).click();
	}
}
