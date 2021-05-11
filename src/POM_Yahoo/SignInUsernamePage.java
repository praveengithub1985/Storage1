package POM_Yahoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInUsernamePage 
{
	//Declaration
	@FindBy(xpath="//input[@class='phone-no ']")
	private WebElement email;
	@FindBy(id="login-signin")
	private WebElement next;
	
	//Initialization
	public SignInUsernamePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void sendEmail(String emailId)
	{
		email.sendKeys(emailId);
	}
	public void clickNext()
	{
		next.click();
	}

}
