package qsp1;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Insta extends Genereic_Script_Insta 
{
	@Test 
	public void instaLogin() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.titleContains("Home"));
		Thread.sleep(2000);
		String tit=driver.getTitle();
		Reporter.log(tit);
	}

}
