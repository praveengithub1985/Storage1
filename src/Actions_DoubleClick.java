import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement dClick=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions a=new Actions(driver);
		a.doubleClick(dClick).perform();
		Thread.sleep(2000);
		Alert at=driver.switchTo().alert();
		String aText=at.getText();
		System.out.println(aText);
		Thread.sleep(2000);
		at.accept();		
		//at.dismiss();	
	}
}
