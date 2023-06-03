package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UITestPractice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Form']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("shahid");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("qureshi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[.='Martial Status:']/following::label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[.='Hobby :']/following::label[3]")).click();
		Thread.sleep(1000);
//		WebElement ele=driver.findElement(By.id("sel1"));
//		Select s=new Select(ele);
//		List<WebElement> opt=s.getOptions();
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("8")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("phonenumber")).sendKeys("9660718634");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("shahidqureshi");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("shahid.qureshi.sdet@gmail.com");
		driver.findElement(By.id("comment")).sendKeys("hi, my name is shahid qureshi. i am from jaipur rajasthan.");
		Thread.sleep(1000);
		driver.findElement(By.id("pwd")).sendKeys("shahidqureshi");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//button[.='Submit']")).click();
		Thread.sleep(1000);
	}

}
