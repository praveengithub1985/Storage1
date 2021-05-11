package POM_Yahoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YahooTest extends GenericTest
{
	@Test
	public void loginTest() throws InterruptedException
	{		
	    SignInUsernamePage user=new SignInUsernamePage(driver);
	    Thread.sleep(2000);
	    user.sendEmail("praveen.kumar108@yahoo.com");
	    Thread.sleep(2000);
	    user.clickNext();
	    Thread.sleep(2000);
	    SignInPasswordPage pass=new SignInPasswordPage(driver);
	    Thread.sleep(2000);
	    pass.SendPassword("Pra_Kum@85");
	    Thread.sleep(2000);
	    pass.clickNext();	    
	}
	
}
