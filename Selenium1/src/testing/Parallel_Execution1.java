package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Execution1 
{
	public  WebDriver driver;
	@Parameters({"browsers"})
	@Test
	public void test1(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println(1);
			driver.get("https://www.twitter.com/");
		}
		else
		{	driver=new FirefoxDriver();
			System.out.println(1);
			driver.get("https://www.twitter.com/");
		}
	}
	

}
