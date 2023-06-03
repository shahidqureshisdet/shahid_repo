package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.id("month"));
		Select s= new Select(ele);
		ArrayList<String> a=new ArrayList<String>();
		List<WebElement> opt=s.getOptions();
		int count=opt.size();
		System.out.println(count);
		int c=0;
		
		for(WebElement abc:opt)
		{
			String x=abc.getText();
			c++;
			a.add(x);
//			System.out.println(x);
			
		}
		System.out.println("the size of list is "+c);
		Collections.sort(a);
		System.out.println(a);
		
		for( String ss:a)
		{
			System.out.println(ss);
		}
		driver.close();
		
	}

}
