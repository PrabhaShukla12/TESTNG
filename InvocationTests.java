package testNG12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTests {

	@Test(invocationCount = 4, threadPoolSize=2)
	public void RandomUser () {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://randomuser.me/");
		System.out.println(d.findElement(By.xpath("//li[@data-label= \"name\"]")));
		WebElement r = d.findElement(By.xpath("//li[@data-label= \"name\"]"));
		String ar = r.getText();
		System.out.print(ar);
		d.quit();
	}

}
