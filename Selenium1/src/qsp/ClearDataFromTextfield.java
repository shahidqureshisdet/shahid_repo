package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataFromTextfield
{ public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/example.html");
	WebElement ele=driver.findElement(By.id("a1"));
	Thread.sleep(2000);
	ele.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	ele.sendKeys(Keys.DELETE);
	
	//driver.close();
}

}
