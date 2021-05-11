import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContainsDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		String s1=driver.findElement(By.xpath("//span[contains(text(),'I ')]")).getText();
		System.out.println(s1);
		String s2=driver.findElement(By.xpath("//span[contains(.,'You')]")).getText();
		System.out.println(s2);
		String s3=driver.findElement(By.xpath("//span[contains(text(),'kids &')]")).getText();
		System.out.println(s3);
		String s4=driver.findElement(By.xpath("//span[contains(.,'bat&')]")).getText();
		System.out.println(s4);
		//Locating partially dynamic attribute
		driver.findElement(By.xpath("//input[contains(@class,'las')]")).sendKeys("pass");
	}
}
