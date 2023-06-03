package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTabs 
{
	 public static void main(String[] args) throws InterruptedException, AWTException 
	{

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.xpath("//a[.='हिन्दी']"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		String p_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh)
		{	if(p_id!=(wh))
			driver.switchTo().window(wh);
		}
		
	
		

}
}