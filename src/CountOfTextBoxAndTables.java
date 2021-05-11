import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountOfTextBoxAndTables 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		driver.manage().window().maximize();
		
		List<WebElement> dropdowns=driver.findElements(By.xpath("//input"));
		int n_textbox=dropdowns.size();
		System.out.println(n_textbox);
		
		List<WebElement> tables=driver.findElements(By.xpath("//table"));
		int n_table=tables.size();
		System.out.println(n_table);
		
		//The below mentioned XPath gives the total number of dropdowns 
		//and tables together
		List<WebElement> links=driver.findElements(By.xpath("//input|//table"));
		int tb_table=links.size();
		System.out.println(tb_table);		
	}
}
