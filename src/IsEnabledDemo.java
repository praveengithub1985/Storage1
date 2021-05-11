import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//input[@name='dob']"));
		/*Add the 'disabled' attribute to the <input> tag in HTML file 
		 *sampleHTML.html if you want not to enable the element.*/
		boolean b=e.isEnabled();
		System.out.println(b);
		if(b)
		{
			System.out.println("The element is Enabled");
		}
		else
		{
			System.out.println("The element is NOT Enabled");
		}
	}
}
