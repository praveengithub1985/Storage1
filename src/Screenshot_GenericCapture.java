import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_GenericCapture 
{
	public static void getPhoto(WebDriver driver) throws IOException 
	{
		String folder="./Screenshot/";
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(folder+date+".jpeg");
		//FileUtils.copyFile(src,dst);   --This is not working in the newer version of Selenium WebDriver
		FileHandler.copy(src,dst);
	}
}
