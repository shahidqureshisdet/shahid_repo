package qsp;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Uncheck
{public static void main(String[] args) throws InterruptedException {
	

	String key="webdriver.chrome.driver";
	String value="./software/chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	Thread.sleep(2000);
	driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/Checkbox.html");
	List<WebElement> chk=driver.findElements(By.xpath("//input"));
	int count=chk.size();
	for(int i=0;i<count;i++)
	{
		WebElement we=chk.get(i);
		Thread.sleep(500);
		we.click();
	}
	for(int i=count-1;i>=0;i--)
	{
		WebElement we=chk.get(i);
		Thread.sleep(500);
		we.click();
	}
	driver.quit();
}
}