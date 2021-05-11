import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintLinksLocationAxes
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));	
		int n_links=links.size();
		for(int i=0;i<n_links;i++)
		{
			WebElement e=links.get(i);
			System.out.println("Location of : "+e.getText());
			Point p=e.getLocation();
			System.out.println(p);
			int x=p.getX();
			int y=p.getY();
			System.out.println(x);
			System.out.println(y);
			System.out.println();
		}
		
	}
}
