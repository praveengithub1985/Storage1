import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Printing_KMs_MINs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/dir/Bellandur,+Bengaluru,+Karnataka/RT+Nagar,+Bengaluru,+Karnataka+560032/@12.9867055,77.5738771,12z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3bae13752e34e92f:0xc2b234a66f986aae!2m2!1d77.678404!2d12.9304278!1m5!1m1!1s0x3bae17bac2a140d9:0x1fe7e4cfffb7e346!2m2!1d77.5947532!2d13.0247291!3e0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String kms=driver.findElement(By.xpath("//div[@id='section-directions-trip-0']//div[@class='section-directions-trip-distance section-directions-trip-secondary-text']/div")).getText();
		System.out.println(kms);
		
		String mins=driver.findElement(By.xpath("//div[@id='section-directions-trip-0']//div[@class='section-directions-trip-distance section-directions-trip-secondary-text']/div/ancestor::div[@class='section-directions-trip-numbers']//span")).getText();
		System.out.println(mins);
	}
}
