import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSizeDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//a[@class='c1']"));
		Dimension d=e.getSize();
		//int h=e.getSize().getHeight();
		//int w=e.getSize().getWidth();
		System.out.println(d);
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println(h);
		System.out.println(w);
	}
}
