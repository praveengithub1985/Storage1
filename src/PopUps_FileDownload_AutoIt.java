import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUps_FileDownload_AutoIt 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);		
		WebElement dl=driver.findElement(By.xpath("//td[.='Java']/following-sibling::td[5]/a[1]"));
		dl.click();			
		Runtime.getRuntime().exec("F:\\SeleniumRevisit\\FileDownloadPopup.exe");
	}
}
