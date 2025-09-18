package testNG12;

import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void TestMethod5()
	{
		System.out.println("TestClass2 >> Test Method5 >> "+ Thread.currentThread().getId());
	}
	
	@Test
	public void TestMethod6()
	{
		System.out.println("TestClass2 >> Test Method6 >> "+ Thread.currentThread().getId());
	}
	
	@Test
	public void TestMethod7()
	{
		System.out.println("TestClass2 >> Test Method7 >> "+ Thread.currentThread().getId());
	}
	
	@Test
	public void TestMethod8()
	{
		System.out.println("TestClass2 >> Test Method8 >> "+ Thread.currentThread().getId());
	}
}
