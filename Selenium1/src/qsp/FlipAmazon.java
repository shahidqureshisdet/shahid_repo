package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipAmazon 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.manage().window().maximize();
//	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[.='✕']")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone 13");
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Blue, 128 GB)']/following::div[7]"));
//	WebElement ele=driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Starlight, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
	
	Thread.sleep(2000);
	String text=ele.getText();
	System.out.println(text);
	
	String newtext=text.replace("₹", "");
	newtext=newtext.replace(",", "");
	System.out.println(newtext);
//	
//	driver.get("https://www.amazon.in/");
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	
	
	
	}
}
