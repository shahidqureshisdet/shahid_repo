package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	driver.manage().window().maximize();
//	Alert a=driver.switchTo().alert();
//	a.dismiss();
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("nike shoes");
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click(); 
	driver.findElement(By.xpath("//a[@href='sports-shoes/nike/nike-men-solid-flex-experience-run-11-next-nature-road-running-shoes/21252446/buy' and @target='_blank']")).click();
	String p_id=driver.getWindowHandle();
	Set<String> allwh=driver.getWindowHandles();
	for(String wh:allwh)
	{
		if(p_id!=wh)
		{
		driver.switchTo().window(wh);
		}
	}
	driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and .='7']")).click();
	driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();

}
}
