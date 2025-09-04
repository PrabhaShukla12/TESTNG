package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginPageObj;

public class Login {
	WebDriver d;
	
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver106\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://phptravels.net/login");
	  d.manage().window().maximize();
	  // Page Factory design
	  PageFactory.initElements(d, LoginPageObj.class);
	  
	  LoginPageObj.username.sendKeys("user@phptravels.com");
	  LoginPageObj.pswd.sendKeys("demouser");
	  LoginPageObj.submit.click();
	  /* Page Object Model
	  
	  LoginPageObj.username(d).sendKeys("user@phptravels.com");
	  LoginPageObj.pswd(d).sendKeys("demouser");
	  LoginPageObj.submit(d).click();
	  */
	  
	  /*
	  d.findElement(By.name("email")).sendKeys("");
	  d.findElement(By.name("password")).sendKeys("");
	  d.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	  */
  }
}
