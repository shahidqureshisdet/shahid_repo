
package org.openqa.selenium;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_Elements_Using_TreeSet 
{
public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		TreeSet<String> l=new TreeSet<String>();
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		int count=opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String text=we.getText();
			l.add(text);
			l.remove("Sep");
		}
//		Collections.sort(l);
		for(String l1:l)
		{
			System.out.println(l1);
		}
		if(l.contains("Sep"))
		{
			System.out.println("Option is present");
			
		}
		else
		{
			System.out.println("option is not present");
		}
		driver.close();
		
	
	}
}
