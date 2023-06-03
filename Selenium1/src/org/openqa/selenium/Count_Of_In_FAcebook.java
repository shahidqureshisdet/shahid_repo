
package org.openqa.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_Of_In_FAcebook 
{
public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='year']"));
		ArrayList<String> l=new ArrayList<String>();
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		int count=opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String text=we.getText();
			l.add(text);
		}
		Collections.sort(l);
		for(String l1:l)
		{
			System.out.println(l1);
		}
		
		driver.close();
		
	
	}
}
