package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {

	WebDriver d;

	@Parameters("browserName")

	@Test(priority=1)
	public void InitializeBrowser(@Optional("chrome") String browserName){

		switch (browserName.toLowerCase()) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();

		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Prabha Shukla\\edgedriver_win64");
			WebDriver d = new EdgeDriver();
			d.manage().window().maximize();

		default:
			System.out.println("Browser name is Invalid");
			break;
		}
	}
		
	@Test
	public void Form() {

		d.get("https://practicetestautomation.com/practice-test-login/");
		d.findElement(By.name("username")).sendKeys("student");
		d.findElement(By.name("password")).sendKeys("Password123");
		WebElement button = d.findElement(By.id("submit"));
		button.click();

		d.findElement(By.xpath("//*[@id=\"menu-item-43\"]/a")).click();

		// for scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("scroll(0, 1500)");
		d.findElement(By.xpath("//*[@id=\"form_first_name_7\"]")).sendKeys("Monika Shinde");
		d.findElement(By.xpath("//*[@id=\"form_email_7\"]")).sendKeys("ae3999628@gmail.com");
		d.findElement(By.xpath("//*[@id=\"mp_form_below_posts7\"]/form/div[3]/input")).click();
		d.quit();

	}

}
