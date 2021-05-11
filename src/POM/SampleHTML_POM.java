package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleHTML_POM 
{
	//Declaration
	@FindBy(xpath="//input[@id='user']")
	private WebElement username;
	
	//Initialization
	public SampleHTML_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clearUsername()
	{
		username.clear();
	}
	public void sendUsername(String text)
	{
		username.sendKeys(text);
	}	
}
