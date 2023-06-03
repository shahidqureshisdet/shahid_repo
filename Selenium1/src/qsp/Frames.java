package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/Main.html");
		Thread.sleep(3000);
		driver.findElement(By.id("a1")).sendKeys("Shahid");
//		driver.switchTo().frame(0);
		driver.switchTo().frame("f1");
//		
//		WebElement ele= driver.findElement(By.id("f1"));
//		
//		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		driver.findElement(By.id("b1")).sendKeys("Qureshi");
		
		

		
	}

}
