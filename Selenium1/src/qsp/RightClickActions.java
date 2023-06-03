
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions 
{ public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//span[.='right click me']"));
//	WebElement ele=driver.findElement(By.xpath("//div[.='Fashion'])[4]"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	
}

}
