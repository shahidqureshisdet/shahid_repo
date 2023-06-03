
package org.openqa.selenium;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Of_Links_Images_On_Amazon 
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
	
		List<WebElement> Li=driver.findElements(By.xpath("//a|//img"));
		int count=Li.size();
		System.out.println(count);
		driver.quit();
	}

}
