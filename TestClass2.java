package testNG;

import org.testng.annotations.Test;

@Test (groups= {"all"})
public class TestClass2 {

	@Test (groups= {"smoke", "window.smoke"})
	public void Test5() {
		System.out.println("Test Case 5");
	}
	
	@Test (groups= {"sanity", "smoke"})
	public void Test6() {
		System.out.println("Test Case 6");
	}
	
	@Test (groups= {"regression", "window.functional"})
	public void Test7() {
		System.out.println("Test Case 7");
	}
	
	@Test (groups= {"functional", "ios.functional"})
	public void Test8() {
		System.out.println("Test Case 8");
	}
	
	@Test (groups = {"window.sanity"})
	public void Test9() {
		System.out.println("Test Case 9");
	}
}
