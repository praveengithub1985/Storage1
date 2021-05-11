import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrintOptionsDescending 
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
		
		/*WebElements cannot be sorted. So we are type casting web elements 
		to String.
		List in collections is an interface. As Interfaces cannot be 
		instantiated, we are instantiating ArrayList which is a class
		that implements the List Interface*/
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement e:options)
		{
			String text=e.getText();
			l.add(text);
		}
		System.out.println(l);
		
		//Sorting in descending order using sort() method
		Collections.sort(l,Collections.reverseOrder());
		for(String t:l)
		{
			System.out.println(t);
			Thread.sleep(500);
		}
		
		//The below code can be used instead of the above sorting mechanism
		//Step1: Sorting in ascending order
		//Step2: Printing the ascending sorted list in a reverse order to achieve descending order 
		/*Collections.sort(l);
		for(int i=n_options-1;i>=0;i--)
		{
			String t=l.get(i);
			System.out.println(t);
			Thread.sleep(500);
		}*/
	}
}
