import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Popups_GetWindowHandle
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:\\PraveenWorkSpace - Zipped\\PraveenWorkSpace\\TestSeleniumProject\\doubleClick.html");
		Thread.sleep(1500);		
		WebElement dc=driver.findElement(By.xpath("//input[@type='button']"));
		Actions act=new Actions(driver);
		act.doubleClick(dc).perform();
		Set<String> whs=driver.getWindowHandles();
		System.out.println(whs);
		int n=whs.size();
		System.out.println(n);
		for(String wid:whs)
		{
			driver.switchTo().window(wid);
			System.out.println(wid);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();			
		}
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		for(String t:whs)
		{
			//String h=t.toString();
			ts.add(t);
			System.out.println("Adding "+t+" to Treeset directly");
			Thread.sleep(1000);			
		}
		System.out.println("\nOrder of closing : "+ts);
		for(String r:ts)
		{
			driver.switchTo().window(r);
			System.out.println("Closing "+driver.getTitle());
			driver.close();
			Thread.sleep(3000);
		}
	}
}
