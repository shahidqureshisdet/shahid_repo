
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClickActionUsingKeyboard
{ public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/Example2.html");
	WebElement ele1=driver.findElement(By.id("a1"));
	
	Thread.sleep(2000);
	ele1.sendKeys(Keys.CONTROL + "a");
	Thread.sleep(2000);
	WebElement ele3=driver.findElement(By.id("a3"));
	ele3.sendKeys(Keys.CONTROL + "v");
	Thread.sleep(2000);
	WebElement ele2=driver.findElement(By.id("a2"));
	ele2.sendKeys(Keys.CONTROL + "v");
	
	
	//driver.close();
}

}
