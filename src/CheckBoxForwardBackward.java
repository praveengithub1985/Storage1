import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxForwardBackward 
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
		for(int i=0;i<n;)  //For clicking on alternate elements
		{
			WebElement e=list.get(i);
			e.click();
			Thread.sleep(500);
			i=i+2;  //For skipping one element and going for the next 
		}
		Thread.sleep(2000);
		for(int j=n-2;j>=0;j--)
		{
			WebElement e=list.get(j);
			e.click();
			Thread.sleep(500);
			j--;
		}
	}
}
