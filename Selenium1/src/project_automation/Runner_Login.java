package project_automation;

import org.testng.annotations.Test;

public class Runner_Login extends Base_proj
{
	@Test
	public void validLogin() throws InterruptedException
	{
		POM_Login p=new POM_Login(driver);
		Thread.sleep(4000);
		p.logincl();
		p.unData("shahidq91@gmail.com");
		Thread.sleep(4000);
		p.passData("qwerty100#");
		Thread.sleep(4000);
		p.clickLogin();
		Thread.sleep(4000);
		
	}

}
