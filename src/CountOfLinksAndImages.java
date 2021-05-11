import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountOfLinksAndImages 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int n_links=links.size();
		System.out.println(n_links);
		List<WebElement> images=driver.findElements(By.xpath("//img"));
		int n_images=images.size();
		System.out.println(n_images);
	}
}
