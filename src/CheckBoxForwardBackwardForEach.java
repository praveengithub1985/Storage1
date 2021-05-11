import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxForwardBackwardForEach 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/checkbox.html");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int n=list.size();
		System.out.println(n);
		for(WebElement e:list)  //Selecting all the checkboxes using for each loop
		{
			e.click();
			Thread.sleep(500);			
		}
		Thread.sleep(2000);
		for(int j=n-1;j>=0;j--)   //Deselecting all the checkboxes using for loop
		{
			WebElement e=list.get(j);
			e.click();
			Thread.sleep(500);			
		}
	}
}
