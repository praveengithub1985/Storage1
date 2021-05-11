import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSEHandleDisabledElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key2="webdriver.chrome.driver";
		String value2="./Drivers/chromedriver.exe";
		System.setProperty(key2,value2);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://F:/SeleniumRevisit/sampleHTML.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		//Clearing the default value of a disabled textbox
		js.executeScript("document.getElementById('user').value=''");
		Thread.sleep(2000);
		//passing data to disabled textbox
		js.executeScript("document.getElementById('date').value='Birth'");
		Thread.sleep(2000);
		//passing data to hidden textbox
		js.executeScript("document.getElementById('pid').value='pass'");  
		Thread.sleep(2000);
		//clicking on hidden link
		js.executeScript("document.getElementById('aid').click()");
	}
}
