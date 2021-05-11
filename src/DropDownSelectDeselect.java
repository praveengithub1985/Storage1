import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectDeselect 
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
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("l");
		Thread.sleep(1000);
		s.selectByVisibleText("Lime Juice");
		List<WebElement> selectedOptions=s.getAllSelectedOptions();
		int n_selectedOptions=selectedOptions.size();
		System.out.println("\nNumber of selected options : "+n_selectedOptions);
		for(WebElement e:selectedOptions)
		{
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		boolean b=s.isMultiple();
		if(b)
		{
			s.deselectAll();
			System.out.println("\nMulti-Option dropdown. All the options are deselected.");
		}
		else			
		{
			System.out.println("\nNOT Multi-Option dropdown.");
		}
	}
}
