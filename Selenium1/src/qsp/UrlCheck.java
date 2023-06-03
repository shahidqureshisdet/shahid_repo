
package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlCheck 
{ public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="https://www.facebook.com/";
	driver.get("https://www.facebook.com/");
	String url1=driver.getCurrentUrl();
	
	if(url.equals(url1))
	{
		System.out.println("This url is same as cutomer given url");
	}
	
	else 
	{
		System.out.println(" url is not same");
	}
	
}

}
