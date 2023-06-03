
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Of_Links_On_Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
	
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		for(int i=0;i<count;i++)
		{
			WebElement we=links.get(i);
			String t=we.getText();
			System.out.println(t);
		}
		System.out.println(count);
		for(WebElement l:links)
		{
			String s=l.getText();
			System.out.println(s);
		}
		System.out.println(count);
		driver.quit();
	}

}
