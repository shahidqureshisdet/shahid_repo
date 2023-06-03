package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para_exe 
{
	public WebDriver driver;
	@Parameters({"browsers"})
	
	@Test
	public void test1(String browser) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		
		if(browser.equals("chrome"))
		{	
			
			driver=new ChromeDriver();
			driver.get("https://www.fb.com/");
			Thread.sleep(1500);
			
		}
		else
		{
			
			driver=new FirefoxDriver();
			driver.get("https://www.fb.com/");
		}
	}

}
