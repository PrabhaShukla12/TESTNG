package testNG12;

import org.testng.annotations.Test;

public class TestClassListeners2 {
	
	@Test(timeOut=1000)
	public void TestMethod5() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("I'm in TestMethod5");
	}
	
	@Test
	public void TestMethod6()
	{
		System.out.println("I'm in TestMethod6");
	}
	
	@Test(dependsOnMethods= "TestMethod5")
	public void TestMethod7()
	{
		System.out.println("I'm in TestMethod7");
	}
	
	@Test
	public void TestMethod8()
	{
		System.out.println("I'm in TestMethod8");
	}
}
