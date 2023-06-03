package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		System.setProperty(key,value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.fb.com");
		Thread.sleep(3000);
		
		String t=driver.getTitle();
		System.out.println(t);
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String src=driver.getPageSource();
		System.out.println(src);
		driver.close();
		
		
	}

}
