package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_Select_Class 
{
public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/MarutiHotel.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='Maruti Hotel']"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("Paneer Dry");
		Thread.sleep(2000);
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectAll();
		boolean b=s.isMultiple();
		if(b)
			System.out.println("dropdown is Multi Select");
		else
			System.out.println("DropDrown is not Multi Select");
		driver.close();
		
	
	}
}
