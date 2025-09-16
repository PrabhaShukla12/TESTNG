package testNG;

import org.testng.annotations.Test;

public class TestGroupDependency {

	@Test (groups= {"smoke"})
	public void Test1() {
		System.out.println("smoke");
	}

	@Test (groups= {"smoke"})
	public void Test2() {
		System.out.println("smoke");
	}
	
	@Test (groups= {"smoke"})
	public void Test3() {
		System.out.println("smoke");
	}
	
	@Test (groups= {"smoke"})
	public void Test4() {
		System.out.println("smoke");
	}
	
	@Test (groups= {"sanity"})
	public void Test5() {
		System.out.println("sanity");
	}
	
	@Test (groups= {"sanity"})
	public void Test6() {
		System.out.println("sanity");
	}
	
	@Test (groups= {"sanity"})
	public void Test7() {
		System.out.println("sanity");
	}
	
	@Test (groups= {"regression"})
	public void Test8() {
		System.out.println("regression");
	}
	
	@Test (dependsOnGroups= {"regression", "sanity", "smoke"})
	public void Test0() {
		System.out.println("Main method");
	}
}
