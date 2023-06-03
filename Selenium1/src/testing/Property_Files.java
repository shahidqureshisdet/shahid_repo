package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_Files 
{
	@Test
	public void test1() throws IOException,FileSystemNotFoundException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./new.properties"));
		//String val=p.getProperty("Id");
		String val=p.getProperty("value");
		System.out.println(val);
	}

}
