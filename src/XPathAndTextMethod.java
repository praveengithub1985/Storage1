import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathAndTextMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		Thread.sleep(3000);
		String hText=driver.findElement(By.xpath("//h1[text()='My First Heading']")).getText();
		System.out.println(hText);
		Thread.sleep(1000);
		String pText=driver.findElement(By.xpath("//p[.='My first paragraph.']")).getText();
		System.out.println(pText);
		Thread.sleep(1000);
		String genderMText=driver.findElement(By.xpath("//label[text()='Male']")).getText();
		System.out.println(genderMText);
		Thread.sleep(1000);
		String genderFText=driver.findElement(By.xpath("//label[.='Female']")).getText();
		System.out.println(genderFText);
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/input")).sendKeys("Praveen");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[2]")).sendKeys("April 1985");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='pclass']")).sendKeys("pass");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a")).click();		
	}
}
