package qsp;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 		driver.get("https://www.amazon.in/");
 		WebElement ele=driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&token=2075D5EAC7BB214089728E2183FD391706D41E94&6']"));
		
 		Point loc=ele.getLocation();
 		int x=loc.getX();
 		int y=loc.getY();
 		JavascriptExecutor js=(JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy("+x+","+(y-300)+")");
 		
 		ele.click();
 		Thread.sleep(5000);
 		
 	
	}

}
