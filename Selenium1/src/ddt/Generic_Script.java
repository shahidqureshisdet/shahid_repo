package ddt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Script 
{	
	public static String get_Data(String Sh,int ro,int ce)

	{	String value="";
		try {
		FileInputStream fis=new FileInputStream("./Excel/Vouchers.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(Sh);
		Row r = sheet.getRow(ro);
		Cell c=r.getCell(ce);
		value=c.toString();
		
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
		return value;
		
	}

}
