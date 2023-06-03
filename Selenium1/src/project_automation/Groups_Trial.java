package project_automation;

import org.testng.annotations.Test;

public class Groups_Trial 
{
	@Test(groups = {"Smoke"})
	public void karthik()
	{
		System.out.println("jhandu balm");
	}
	@Test(groups = {"Smoke","Sanity"})
	public void sachin()
	{
		System.out.println("tiger balm");
	}
	@Test(groups = {"Sanity"})
	public void shahid()
	{
		System.out.println("no balm only be calm");
	}

}
