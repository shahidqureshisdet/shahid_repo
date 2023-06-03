
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsEnabled
{ public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/example.html");
	WebElement ele=driver.findElement(By.id("a1"));
	boolean b=ele.isEnabled();
	if(b)
		System.out.println("element is enabled");
	else
		System.out.println("element is not enabled");

	driver.close();
}

}
