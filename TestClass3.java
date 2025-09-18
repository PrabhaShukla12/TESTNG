package testNG12;

import org.testng.annotations.Test;

public class TestClass3 {
	
	@Test
	public void TestMethod9()
	{
		System.out.println("TestClass3 >> Test Method9 >> "+ Thread.currentThread().getId());
	}
	
	@Test
	public void TestMethod10()
	{
		System.out.println("TestClass3 >> Test Method10 >> "+ Thread.currentThread().getId());
	}
	
	@Test
	public void TestMethod11()
	{
		System.out.println("TestClass3 >> Test Method11 >> "+ Thread.currentThread().getId());
	}
	
	@Test
	public void TestMethod12()
	{
		System.out.println("TestClass3 >> Test Method12 >> "+ Thread.currentThread().getId());
	}
}
