import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUps_HiddenDivision 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);		
		WebElement cal=driver.findElement(By.xpath("//span[.='DEPARTURE']"));
		cal.click();
		Thread.sleep(2000);		
		WebElement date=driver.findElement(By.xpath("(//p[.='10'])[2]"));
		date.click();
		WebElement d=driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[1]"));
		System.out.println(d.getText());
		WebElement m=driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[2]"));
		System.out.println(m.getText());
		WebElement y=driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[3]"));
		System.out.println(y.getText());
	}
}
