package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutTest {

	@Test(timeOut= 8000)
	public void test() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.facebook.com/");
		
		d.quit();
		
	}
}
