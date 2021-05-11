
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTesting_WriteMultipleData
{
	public static void main(String[] args) throws IOException 
	{
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/SeleniumRevisit/dropdown.html");
		WebElement mtr=driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> options=s.getOptions();
		int n=options.size();
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			String mtr_option=options.get(i).getText();
			System.out.println(mtr_option);
			DataDrivenTesting_GenericWrite.writeData(i,mtr_option);
		}
	}
}
