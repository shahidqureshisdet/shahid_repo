package Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_project_FB 
{
	public WebDriver driver;
	@BeforeMethod
	
		public void openApp()
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		}

	@AfterMethod
	public void closeAppi)
	{
		driver.close();
	}
}
