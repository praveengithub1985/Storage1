import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrintOptionsDescendingTreeset 
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
		//Get the address of all the options
		List<WebElement> options=s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(WebElement e:options)
		{
			String text=e.getText();
			ts.add(text);
		}
		for(String t:ts)	
		{
			System.out.println(t);
		}
	}
}
