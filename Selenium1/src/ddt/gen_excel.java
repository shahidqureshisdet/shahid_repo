package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class gen_excel 
{

	public static String test1(String sh,int row,int cell)  
	{String s="";
		try {
		FileInputStream fis = new FileInputStream("./Excel/data1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sh);
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		s = c.toString();
		
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return s;
	}

}
