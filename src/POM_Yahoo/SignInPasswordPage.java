package POM_Yahoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPasswordPage 
{
	//Declaration
	@FindBy(id="login-passwd")
	private WebElement password;
	@FindBy(id="login-signin")
	private WebElement next;
	
	//Initialization
	public SignInPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void SendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickNext()
	{
		next.click();
	}

}
