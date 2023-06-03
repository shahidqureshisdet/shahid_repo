
package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genereic_Script_Insta 
{
	public WebDriver driver;
	@BeforeMethod
	
		public void openApp()
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			
		}

	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}
