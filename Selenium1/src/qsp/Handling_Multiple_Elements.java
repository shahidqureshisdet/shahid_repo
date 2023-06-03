package qsp;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Elements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/shahi_2zwsyd6/OneDrive/Desktop/html/Multiple_Element_Handling_Source_Code.html");
		
		Thread.sleep(2000);
	
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		driver.quit();
	}

}
