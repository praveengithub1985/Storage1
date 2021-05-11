import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting_WriteSingleData
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/WriteSingle.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Hi");
		FileOutputStream fos=new FileOutputStream("./Excel/WriteSingle.xlsx");
		wb.write(fos);
		wb.close();
	}
}
