import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PropertiesDemo 
{
	@Test
	public void testProperty() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./credentials.properties"));
		String un=p.getProperty("username");
		System.out.println(un);
		String pw=p.getProperty("password");
		System.out.println(pw);
	}
	
}
