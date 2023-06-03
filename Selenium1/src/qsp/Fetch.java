
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class Fetch
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
	
	driver.close();
	}
}