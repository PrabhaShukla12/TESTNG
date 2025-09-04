package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateFirstTest {

	@Test
	public void GoogleTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("TESTNG" , Keys.ENTER);
		System.out.println(d.getTitle());
		
		Thread.sleep(1000);
		d.quit();
		
	}
	

}
