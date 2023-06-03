
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{ public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	driver.manage().window().maximize();
	WebElement src=driver.findElement(By.id("box1"));
	WebElement dst=driver.findElement(By.id("box103"));
	Actions act=new Actions(driver);
	act.dragAndDrop(src,dst).perform();
	
}

}
