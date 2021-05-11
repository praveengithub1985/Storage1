import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting_ReadSingleData
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("F:/SeleniumRevisit/SeleniumTraining/Excel/LeavePlan.xlsx");	
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		System.out.println(rowCount);
		
		Row r=sh.getRow(0);
		int cellCount=r.getLastCellNum();
		System.out.println(cellCount);
		
		Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println("Data present in 0,0 : "+data);
		Row rDate=sh.getRow(4);
		Cell cDate=rDate.getCell(1);
		Date dateValue=cDate.getDateCellValue();
		System.out.println("Data present in 4,1 : "+dateValue);	
		Row r1=sh.getRow(5);
		Cell c1=r1.getCell(3);
		double dataNum=c1.getNumericCellValue();
		System.out.println("Data present in 5,3 : "+dataNum);		
	}
}
