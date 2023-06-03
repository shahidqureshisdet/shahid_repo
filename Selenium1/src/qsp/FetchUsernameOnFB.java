package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchUsernameOnFB 
{
public static void main(String[] args) 
{
	String key="webdriver.chrome.driver";
	String value="./software/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
	String c=ele.getCssValue("font-size");
	System.out.println(c);
	driver.close();
}
}
