import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(2000);
		WebElement b1=driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement b2=driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		//a.dragAndDrop(b1,b2).perform();
		a.clickAndHold(b1).moveToElement(b2).release().perform();
	}
}
