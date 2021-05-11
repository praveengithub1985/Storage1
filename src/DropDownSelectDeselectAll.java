import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectDeselectAll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/dropdown.html");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//Select[@id='iyengar']"));
		Select s=new Select(dd);
		Thread.sleep(1000);
		
		List<WebElement> options=s.getOptions();
		int n_options=options.size();
		System.out.println("Total available options : "+n_options);
		for(int i=0;i<n_options;i=i+2)
		{
			s.selectByIndex(i);
			Thread.sleep(500);
		}	
		for(int i=n_options-1;i>=0;i--)
		{
			s.deselectByIndex(i);
			Thread.sleep(500);
		}		
	}
}
