package Selenium_Tricks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_auto_it
{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	
		driver.findElement(By.xpath("//span[.='Select PDF file']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\shahi_2zwsyd6\\OneDrive\\Desktop\\fileupload.exe");
	}

}
