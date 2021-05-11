import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintAllImagesPath 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		driver.manage().window().maximize();
		List<WebElement> images=driver.findElements(By.xpath("//img"));
		int n_images=images.size();
		System.out.println(n_images);
		for(int i=0;i<n_images;i++)
		{
			WebElement e=images.get(i);
			String s=e.getAttribute("src");
			System.out.println(s);
		}		
	}
}
