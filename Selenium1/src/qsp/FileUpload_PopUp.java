package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_PopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/shahids11.html");
		Thread.sleep(2000);
	
		WebElement ele=driver.findElement(By.name("uploadfile"));
		ele.sendKeys("C:\\Users\\shahi_2zwsyd6\\OneDrive\\Desktop\\html\\one.html");
		Thread.sleep(2000);
		
	}
}
	