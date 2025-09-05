package testNG;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	public void AssertEqualTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.facebook.com/");
		
		String ExpectedTitle= "Facebook – log in or sign up";
		String ActualTitle = d.getTitle();
		
		assertEquals(ActualTitle, ExpectedTitle, "The Title is mismatched");
		assertTrue(true);

		d.quit();
	}
}
