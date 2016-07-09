package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testing {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void loginToGmail() throws InterruptedException {
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).click();
		driver.findElement(By.id("Email")).sendKeys("demotestname980");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Test@12345");
		driver.findElement(By.id("signIn")).click();

	}

}
