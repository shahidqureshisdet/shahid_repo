package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsDisplayed
{ public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/example.html");
	WebElement ele=driver.findElement(By.id("a1"));
	boolean b=ele.isDisplayed();
	if(b)
		System.out.println("element is displayed");
	else
		System.out.println("element is not displayed");

	driver.close();
}

}
