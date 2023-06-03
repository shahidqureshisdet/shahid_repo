package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDown 
{
public static void main(String[] args) throws InterruptedException
{	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/MarutiHotel.html");
	
	driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.id("Maruti Hotel"));
	Select s=new Select(ele);
	List<WebElement> opt=s.getOptions();
	int count=opt.size();
	s.selectByIndex(1);
	Thread.sleep(2000);
	s.selectByValue("l");
	Thread.sleep(2000);
	s.selectByVisibleText("Paneer Dry");
	Thread.sleep(2000);
	s.deselectAll();
	
}
}
