package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreClass {

	@Test
	public void Test1(){
		System.out.println("Test Method 1");
	}
	
	@Test
	public void Test2(){
		System.out.println("Test Method 2");
	}
	
	@Test
	public void Test3(){
		System.out.println("Test Method 3");
	}
	
}
	@Ignore
	class classB {
	
	@Test
	public void Test4() {
		System.out.println("Test Method 4");
	}

	@Test
	public void Test5() {
		System.out.println("Test Method 5");
	}
	}
	
	
