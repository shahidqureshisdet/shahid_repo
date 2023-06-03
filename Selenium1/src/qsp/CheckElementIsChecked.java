
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsChecked
{ public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/example.html");
	WebElement ele=driver.findElement(By.id("a2"));
	boolean b=ele.isEnabled();
	if(b)
		System.out.println("element is checked");
	else
		System.out.println("element is not checked");

	driver.close();
}

}
