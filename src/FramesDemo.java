import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("F:/SeleniumRevisit/page1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='t1']"));
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='f1']"));
		Thread.sleep(1000);
		e1.sendKeys("Home Page");
		driver.switchTo().frame(frame1);  //Switch using WebElement
		Thread.sleep(1000);
		WebElement e2=driver.findElement(By.xpath("//input[@id='t2']"));
		e2.sendKeys("Frame1");
		driver.switchTo().frame(0);  //Switch using Index
		Thread.sleep(1000);
		WebElement e3=driver.findElement(By.xpath("//input[@id='t3']"));
		e3.sendKeys("Frame2");  
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		e2.sendKeys(" Frame1 revisit");
		Thread.sleep(1000);
		driver.switchTo().frame("f2");  //Switch using Attribute 'id' value
		e3.sendKeys(" Frame2 revisit");  
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		e1.sendKeys(" Home Page revisit");		
	}
}
