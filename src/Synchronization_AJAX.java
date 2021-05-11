

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_AJAX 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D82875260045%26hvpone%3D%26hvptwo%3D%26hvadid%3D398776709897%26hvpos%3D1t1%26hvnetw%3Dg%26hvrand%3D14648558173157638378%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062238%26hvtargid%3Dkwd-895441526047%26hydadcr%3D7878_1982971%26gclid%3DEAIaIQobChMIuvL46KbR5gIVgpKPCh0y3AtmEAAYASAAEgK6yvD_BwE&switch_account=");
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("8867571101");
		WebElement continu=driver.findElement(By.id("continue"));
		continu.click();
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Pra_Kum@85");
		WebElement signIn=driver.findElement(By.id("signInSubmit"));
		signIn.click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Amazon Pay ICICI Bank Credit Card']")));
		WebElement mi=driver.findElement(By.xpath("//img[@alt='Amazon Pay ICICI Bank Credit Card']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1843, 354)");
		Actions act=new Actions(driver);
		act.moveByOffset(50,50).click().perform();
		System.out.println("Execution done");
		//act.moveToElement(mi,0,0).click().perform();
		
	}
}
