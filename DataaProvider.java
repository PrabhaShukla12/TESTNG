package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataaProvider {

	@Test(dataProvider = "logindata")
	public void login(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(password);
		WebElement b = d
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		b.click();
		Thread.sleep(3000);

		WebElement ele = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"));
		if (ele.isDisplayed())
			System.out.println("Logged In Successfully");
		{
			d.quit();
		}
	}

	@DataProvider(name = "logindata")
	public Object[][] dataa() {
		Object[][] data = new Object[4][2];

		data[0][0] = "Admin";
		data[0][1] = "123ad";

		data[1][0] = "Adm3in";
		data[1][1] = "admin123";

		data[2][0] = "Adminn";
		data[2][1] = "123adgt";

		data[3][0] = "Admin";
		data[3][1] = "admin123";

		return data;
	}
}
