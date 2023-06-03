
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class FetchLocation
{ 
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele=driver.findElement(By.xpath("//a[.='हिन्दी']"));
	String att=ele.getAttribute("href");
	System.out.println(att);
	WebElement ele1=driver.findElement(By.xpath("//a[@title='Urdu']"));
	String T=ele1.getText();
	System.out.println(T);
//	ele1.getScreenshotAs(null)
	Point loc=ele.getLocation();
	System.out.println(loc);
	int x=loc.getX();
	System.out.println(x);
	int y=loc.getY();
	System.out.println(y);
	Point loc1= ele1.getLocation();
	System.out.println(loc1);
	int x1=loc1.getX();
	System.out.println(x1);
	int y1=loc1.getY();
	System.out.println(y1);
	
	
	driver.close();
	}
}