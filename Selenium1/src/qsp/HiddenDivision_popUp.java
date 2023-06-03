package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_popUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
//		
		driver.manage().window().maximize();
		driver.get("https://redbus.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id='r-date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.=3])[1]")).click();
		Thread.sleep(3000);
//		
//		Alert a=driver.switchTo().alert();
//		String s=a.getText();
//		System.out.println(s);
		
		driver.close();
	
	
	}

}
