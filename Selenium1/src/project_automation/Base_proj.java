package project_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_proj 
{	public WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://106.51.87.42:9008/?d=IN");
	driver.manage().window().maximize();
	
}

@AfterMethod
public void closeApp()
	{
	driver.close();
	
	}
		
	}


