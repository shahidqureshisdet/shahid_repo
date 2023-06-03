package Hybrid;

import org.testng.annotations.Test;

public class FB_Login extends Base_project_FB
{@Test
	public void validLogin() throws InterruptedException
	{
	POM_Script p=new POM_Script(driver);
	p.unData("shahidq91@gmail.com");
	Thread.sleep(2000);
	p.passData("ABDfacebook100#");
	Thread.sleep(2000);
	p.clickLogin();
	Thread.sleep(6000);
	}

@Test
public void validLogin2() throws InterruptedException
	{
		validLogin();
		
	}
}
