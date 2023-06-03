package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.jmx.ManagedAttribute;

public class Multiple_operations 
{
public static void main(String[] args) throws InterruptedException 
{
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		Dimension d=new Dimension(200,300);
		
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p= new Point(200,300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.twitter.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.quit();
}

}
