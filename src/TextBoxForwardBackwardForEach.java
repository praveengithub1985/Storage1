import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxForwardBackwardForEach 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/textbox.html");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='text']"));
		int n=list.size();
		System.out.println(n);
		for(WebElement e:list)  //Passing data to all the textboxes using for each loop
		{
			e.sendKeys("Praveen");
			Thread.sleep(500);			
		}
		Thread.sleep(2000);
		for(WebElement e:list)   //clearing all the textboxes using for each loop
		{
			e.sendKeys(Keys.CONTROL+"a");
			e.sendKeys(Keys.DELETE);			
			Thread.sleep(500);			
		}
	}
}
