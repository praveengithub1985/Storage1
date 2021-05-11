import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//a[.='ClassName123']"));	
		/*Add the 'hidden' attribute to the <a> tag in HTML file sampleHTML.html
		  if you want not to display the element.*/
		//Also Don't use the link text 'ClassName' as it gives NoSuchElementException
		boolean b=e.isDisplayed();
		System.out.println(b);
		if(b)
		{
			System.out.println("The element is displayed");
		}
		else
		{
			System.out.println("The element is NOT displayed");
		}
	}
}
