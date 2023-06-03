
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Amazon 
{ public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//button[.='✕']")).click();
	WebElement ele=driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	
}

}
