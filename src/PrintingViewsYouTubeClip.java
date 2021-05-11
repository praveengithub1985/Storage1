import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingViewsYouTubeClip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=udKE1ksKWDE");
		String count=driver.findElement(By.xpath("//yt-formatted-string[contains(.,'The Avengers ')]/../..//div[@id='count']//ytd-video-view-count-renderer/span[1]")).getText();
		System.out.println(count);
	}
}
