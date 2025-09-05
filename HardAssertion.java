package testNG;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void FacebookTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.facebook.com/");
		d.findElement(By.name("email")).sendKeys("TESTNG", Keys.ENTER);
		System.out.println(d.getTitle());

		// Title Assertion
		String ExpectedTitle = "Log in to Facebook";
		String ActualTitle = d.getTitle();
		assertEquals(ActualTitle, ExpectedTitle, "The Title is not matched");

		// URL Assertion
		String ExpectedURL = "https://www.facebook.com/";
		String ActualURL = d.getCurrentUrl();
		assertNotEquals(ActualURL, ExpectedURL, "The URL is not matched");

		//Text Assertion
		String ExpectedText = "";
		String ActualText = d.findElement(By.name("email")).getAttribute("value");
		assertNotEquals(ActualText, ExpectedText, "The Username text is not matched");
		
		// Border Assertion
		String ExpectedBorder = "1px solid rgb(240, 40, 73)";
		String ActualBorder = d.findElement(By.name("email")).getCssValue("border");
		assertEquals(ActualBorder, ExpectedBorder, "The border is not matched");
		
		// Error Message Assertion
		String ExpectedErrorMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String ActualErrorMsg = d.findElement(By.xpath("//*[@id= 'email_container']//following-sibling::div[2]")).getText();
		assertEquals(ActualErrorMsg, ExpectedErrorMsg, "The error message is not matched");

	}
}
