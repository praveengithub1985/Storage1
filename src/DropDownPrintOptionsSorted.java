import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrintOptionsSorted 
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
		/*WebElements cannot be sorted. So we are type casting web elements 
		to String.
		List in collections is an interface. As Interfaces cannot be 
		instantiated, we are instantiating ArrayList which is a class
		that implements the List Interface*/
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement e:options)
		{
			String t=e.getText();
			l.add(t);
		}
		Collections.sort(l);
		for(String text:l)
		{
			System.out.println(text);
		}				
	}
}
