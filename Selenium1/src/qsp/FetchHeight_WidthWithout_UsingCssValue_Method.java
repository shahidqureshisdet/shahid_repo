
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchHeight_WidthWithout_UsingCssValue_Method 
{
public static void main(String[] args) 
{
	String key="webdriver.chrome.driver";
	String value="./software/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
	int h=ele.getSize().getHeight();
	int w=ele.getSize().getWidth();
	System.out.println("height is "+h+" and width is "+w);
	
	driver.close();
}
}
