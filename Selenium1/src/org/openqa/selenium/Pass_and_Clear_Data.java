package org.openqa.selenium;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_and_Clear_Data 
{
public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/Example2.html");
	List<WebElement> text=driver.findElements(By.xpath("//input[@type='text']"));
	int count=text.size();
	System.out.println(count);
	Thread.sleep(2000);
	for(int i=0;i<count;i++)
	{	Thread.sleep(500);
		WebElement we=text.get(i);
		we.clear();
		
	}
	for(WebElement we :text)
	{
		we.sendKeys("shahid");
		Thread.sleep(500);
	}
	for(int i=count-1;i>=0;i--)
	{
		WebElement we=text.get(i);
		we.clear();
		Thread.sleep(500);
	}
	driver.quit();
 }
}
