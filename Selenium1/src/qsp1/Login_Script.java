package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Script 
{
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		POM_Script p=new POM_Script(driver);
		p.unData("shahidq91@gmail.com");
		Thread.sleep(2000);
		p.passData("ABDfacebook100#");
		Thread.sleep(2000);
		p.clickLogin();
	}

}
