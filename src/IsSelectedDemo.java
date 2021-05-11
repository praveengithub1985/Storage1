import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectedDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//input[@id='male']"));
		//e.click();
		/*uncomment the above statement to see the result as 'true'*/
		boolean b=e.isSelected();
		System.out.println(b);
		if(b)
		{
			System.out.println("The element is Selected");
		}
		else
		{
			System.out.println("The element is NOT Selected");
		}
	}
}
