import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Handled");
		}
		driver.close();
	}
}
