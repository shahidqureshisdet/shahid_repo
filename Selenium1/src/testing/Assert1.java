package testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 extends Generic_Script
{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.id("email")).sendKeys("shahid.qureshi.sdet@gmail.com"); 
		driver.findElement(By.id("password")).sendKeys("qwerty123");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		String t=driver.getTitle();
		System.out.println(t);
		Assert.assertTrue(t.contains("in"));
//		SoftAssert sa=new SoftAssert();
//		sa.assertEquals(t,"hghgh");
//		Assert.assertEquals(t,"fgf");
		System.out.println(1);
//		sa.assertAll();
	}

}
