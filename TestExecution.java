package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExecution {

		@Test
		public void OrangeHRMLogin() throws InterruptedException {
			
			// launching Chrome browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			
			// maximizing window
			d.manage().window().maximize();
			
			//for opening a URL
			d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			
			// Logging In with correct username and password
			d.findElement(By.name("username")).sendKeys("Admin");
			d.findElement(By.name("password")).sendKeys("admin123");
			WebElement b= d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			b.click();
			
			// Delaying an execution for 1 second here
			Thread.sleep(1000);
			
			// closing the browser
			d.quit();
			}
		
		
		@Test
		public void OrangeHRMVerifyButton() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://letcode.in/test");
			Thread.sleep(1000);
			WebElement verify= d.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[1]/a[1]/img"));
			
			// verifying whether the account has been logged in successful or not.
			if(verify.isDisplayed())
			{
				System.out.println("Account is logged in successfully");
			}
			else
			{
				System.out.println("Login Failed");
			}
			Thread.sleep(1000);
			d.quit();
			}
		}


class TestScenario {
	
	@Test
	public void Form() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://practicetestautomation.com/practice-test-login/");
		d.findElement(By.name("username")).sendKeys("student");
		d.findElement(By.name("password")).sendKeys("Password123");
		WebElement button= d.findElement(By.id("submit"));
		button.click();
		
		d.findElement(By.xpath("//*[@id=\"menu-item-43\"]/a")).click();
		
		//for scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scroll(0, 1500)");
		d.findElement(By.xpath("//*[@id=\"form_first_name_7\"]")).sendKeys("Monika Shinde");
		d.findElement(By.xpath("//*[@id=\"form_email_7\"]")).sendKeys("ae3999628@gmail.com");
		d.findElement(By.xpath("//*[@id=\"mp_form_below_posts7\"]/form/div[3]/input")).click();
		
		d.quit();
	}
	
}

class Register{
	
	@Test
	public void RegisterForm (){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.tutorialspoint.com/selenium/practice/register.php");
	d.findElement(By.id("firstname")).sendKeys("Monika");
	d.findElement(By.id("lastname")).sendKeys("Shinde");
	d.findElement(By.id("username")).sendKeys("MShinde12");
	d.findElement(By.id("password")).sendKeys("Shi@123Monika");
	d.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/input")).click();
	d.quit();
}
	
	@Test
	public void SeleniumLogin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		d.findElement(By.id("email")).sendKeys("ae3999628@gmail.com");
		d.findElement(By.id("password")).sendKeys("Sh9628Monika");
		d.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input")).click();
		
	}
	}


