package qsp1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Project_Login extends GenericScript
{
@Test(invocationCount=2)
public void validLogin() throws InterruptedException
{
	driver.findElement(By.xpath("//a[.='Login']")).click();
	driver.findElement(By.id("email")).sendKeys("shahid.qureshi.sdet@gmail.com"); 
	driver.findElement(By.id("password")).sendKeys("qwerty123");
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(2000);
	String t=driver.getTitle();
	Reporter.log(t);

}

}
