import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintAllLinksText 
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
		for(WebElement e:links)
		{			
			String s=e.getText();
			System.out.println(s);
		}		
	}
}
