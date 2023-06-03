package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction 
{ public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//	WebElement ele=driver.findElement(By.xpath("//div[.='Fashion'])[4]"));
	Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
	
}

}
