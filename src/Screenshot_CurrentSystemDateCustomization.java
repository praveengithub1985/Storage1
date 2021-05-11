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

public class Screenshot_CurrentSystemDateCustomization 
{
	public static void main(String[] args)
	{
		Date d=new Date();
		System.out.println(d);
		String dString=d.toString();
		System.out.println(dString);
		String date=dString.replaceAll(":","-");
		System.out.println(date);
	}
}
