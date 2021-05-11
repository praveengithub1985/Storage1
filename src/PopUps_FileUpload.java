import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUps_FileUpload 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easyupload.io/");
		Thread.sleep(2000);
		WebElement ul=driver.findElement(By.xpath("//button[@class='dz-button']"));
		ul.click();
		Thread.sleep(2000);		
		Robot r=new Robot();
		StringSelection filePath=new StringSelection("F:\\CodeFolder\\In\\Inner\\sample.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		WebElement arrow=driver.findElement(By.xpath("//i[@class='arrow down']"));
		arrow.click();	
		Thread.sleep(2000);	
		WebElement exp=driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li[4]"));
		exp.click();		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("pass");
		WebElement upload=driver.findElement(By.xpath("//button[@id='upload']"));
		upload.click();
	}
}
