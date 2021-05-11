
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitWait_VariousConditions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Loader.html");
		WebElement run=driver.findElement(By.id("loader"));
		run.click();	
		WebDriverWait wait=new WebDriverWait(driver,50);
		//Any one of the below 3 wait conditions can be used.
		//wait.until(ExpectedConditions.attributeToBe(By.id("myModal"),"style","display: block; padding-right: 17px;"));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h1[.='Please wait...']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Lorem ipsum')]")));
		WebElement modalPopup=driver.findElement(By.xpath("//p[contains(.,'Lorem ipsum')]"));
		System.out.println(modalPopup);		
		System.out.println(modalPopup.getText());
		System.out.println("Finished");
	}	
}
