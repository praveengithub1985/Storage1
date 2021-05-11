import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_RightClick_Robot 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(2000);
		
		//Right-Click action
		WebElement rClick=driver.findElement(By.xpath("//a[.='I love you']"));
		Actions a=new Actions(driver);
		a.contextClick(rClick).perform();
		Thread.sleep(2000);
		
		//Perform 'Open in new tab' action
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_T);		
	}
}
