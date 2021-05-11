import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingNRR_MumbaiIndians 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019/points-table");
		String count=driver.findElement(By.xpath("//a[.='Mumbai Indians']/ancestor::tr/td[8]")).getText();
		System.out.println(count);
	}
}
