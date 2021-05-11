import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement electronics=driver.findElement(By.xpath("//div[@class='xtXmba' and .='Electronics']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(electronics).perform();	
		Thread.sleep(2000);
		WebElement modAcc=driver.findElement(By.xpath("//a[.='MobileAccessory']"));
		a.moveToElement(modAcc).perform();
		Thread.sleep(2000);
		WebElement scrGrd=driver.findElement(By.xpath("//a[.='Screen Guards']"));
		a.moveToElement(scrGrd).perform();
		driver.findElement(By.xpath("//a[.='Screen Guards']")).click();
	}
}
