package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class YoutubeByXpath 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("pathaan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//yt-formatted-string [contains(.,'Jhoome Jo Pathaan Song | Shah Rukh Khan, Deepika | Vishal & Sheykhar, Arijit Singh, Sukriti, Kumaar')]")).click();
	//	driver.findElement(By.xpath("//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
	
	}

}
