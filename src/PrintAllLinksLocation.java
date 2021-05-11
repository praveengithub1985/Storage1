import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintAllLinksLocation 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int n_links=links.size();
		System.out.println(n_links);
		for(int i=0;i<n_links;i++)
		{
			WebElement e=links.get(i);
			String s=e.getAttribute("href");
			System.out.println(s);
		}		
	}
}
