package testNG12;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestClassListeners1 {
	
	@Test
	public void TestMethod1()
	{
		System.out.println("I'm in TestMethod1");
	}
	
	@Test
	public void TestMethod2()
	{
		System.out.println("I'm in TestMethod2");
	}
	
	@Test
	public void TestMethod3()
	{
		System.out.println(5/0);
		System.out.println("I'm in TestMethod3");
	}
	
	@Test(dependsOnMethods= "TestMethod3")
	public void TestMethod4()
	{
		System.out.println("I'm in TestMethod4");
	}
}
