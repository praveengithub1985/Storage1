import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting_ReadMultipleData
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("F:/SeleniumRevisit/SeleniumTraining/Excel/String.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int r_count=sh.getLastRowNum();
		for(int i=0;i<=r_count;i++)
		{
			Row r=sh.getRow(i);
			int c_count=r.getLastCellNum();
			for(int j=0;j<c_count;j++)
			{				
				Cell c=r.getCell(j);				
				String data=c.getStringCellValue();
				System.out.print(data+"\t");				
			}
			System.out.println();
		}
		
	}
}
