package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title 
{ public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String Title="Facebook - log in or sign up";
	driver.get("https://www.facebook.com");
	String t2=driver.getTitle();
	
	if(Title.contains(t2))
	{
		System.out.println("This Title is same as cutomer given Title");
	}
	
	else 
	{System.out.println(" title is not same");
	}
	
}

}
