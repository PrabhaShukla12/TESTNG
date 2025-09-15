package testNG;

import org.testng.annotations.Test;

@Test (groups = {"all"})
public class TestClass1 {

	@Test (groups= {"regression", "smoke", "ios.sanity"})
	public void Test1() {
		System.out.println("Test Case 1");
	}
	
	@Test (groups= {"functional"})
	public void Test2() {
		System.out.println("Test Case 2");
	}
	
	@Test (groups= {"window.smoke", "ios.functional"})
	public void Test3() {
		System.out.println("Test Case 3");
	}
	
	@Test (groups= {"sanity"})
	public void Test4() {
		System.out.println("Test Case 4");
	}
	
}
