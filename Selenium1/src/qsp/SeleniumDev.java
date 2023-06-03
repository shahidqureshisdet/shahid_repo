
package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDev 
{
	 public static void main(String[] args) throws InterruptedException, AWTException 
	{

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		WebElement ele1= driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2= driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3= driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele4= driver.findElement(By.xpath("//span[.='Support']"));
		WebElement ele5= driver.findElement(By.xpath("//span[.='Blog']"));
		
		ArrayList<WebElement> a=new ArrayList<WebElement>();
		a.add(ele1);
		a.add(ele2);
		a.add(ele3);
		a.add(ele4);
		a.add(ele5);
		
		
		Actions act=new Actions(driver);
		Robot r=new Robot();
		
		
		for(WebElement we : a)
		{
//			System.out.println(we.getText());
			act.contextClick(we).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}		
		Set<String> allwh=driver.getWindowHandles();
		int size=allwh.size();
		System.out.println(size);
	

}
}