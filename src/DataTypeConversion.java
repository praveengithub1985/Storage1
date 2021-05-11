import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DataTypeConversion 
{
	public static void main(String[] args) 
	{
		String a="100";	
		int i=Integer.parseInt(a);
		System.out.println(i);
		long l=Long.parseLong(a);
		System.out.println(l);
		float f=Float.parseFloat(a);
		System.out.println(f);
		double d=Double.parseDouble(a);
		System.out.println(d);
	}
}
