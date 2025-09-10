package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

	WebDriver d;

	@Parameters("browserName")

	@BeforeMethod
	public void InitializeBrowser(String browserName) {

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
	
	@Parameters("url")
	@Test()
	public void launch(String url)
	{
		d.get(url);
		}

	@AfterMethod
	public void CloseBrowser() {
		d.quit();
	}
	@Parameters({"username" ,"password"})
	@Test
	public void OrangeHRMLogin(String username, String password) throws InterruptedException {
		
		// for opening a URL
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// Logging In with correct username and password
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		WebElement b = d
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		b.click();

		// Delaying an execution for 1 second here
		Thread.sleep(1000);
	}

	@Test
	public void OrangeHRMVerifyButton() throws InterruptedException {

		d.get("https://letcode.in/test");
		Thread.sleep(1000);
		WebElement verify = d.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[1]/a[1]/img"));

		// verifying whether the account has been logged in successful or not.
		if (verify.isDisplayed()) {
			System.out.println("Account is logged in successfully");
		} else {
			System.out.println("Login Failed");
		}
		Thread.sleep(1000);

	}

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

	}

	@Test
	public void SeleniumLogin() {

		d.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		d.findElement(By.id("email")).sendKeys("ae3999628@gmail.com");
		d.findElement(By.id("password")).sendKeys("Sh9628Monika");
		d.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input")).click();

	}

}
