
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonImgLinks 
{
	public static void main(String []args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//img | //a"));
		int count=links.size();
		System.out.println(count);
	}

}
