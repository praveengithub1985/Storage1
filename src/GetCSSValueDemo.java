import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSSValueDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e1=driver.findElement(By.xpath("//input[@id='pid']"));			
		String textSize1=e1.getCssValue("font-size");
		System.out.println(textSize1);
		String f1=e1.getCssValue("color");
		System.out.println(f1);
		WebElement e=driver.findElement(By.xpath("//span[2]"));
		String textSize2=e.getCssValue("font-size");
		System.out.println(textSize2);
	}
}
