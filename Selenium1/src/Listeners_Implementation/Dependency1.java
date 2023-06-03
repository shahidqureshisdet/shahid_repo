 package Listeners_Implementation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency1 
{
@Test
public void test1()
 {
	System.out.println("Jaipur");
 }
@Test
public void test2()
 {
	System.out.println("Rajasthan");
	Assert.fail();
 }
@Test(dependsOnMethods = "test2")
public void test3()
 {
	System.out.println("India");
 }
}
