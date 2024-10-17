package org.xyz.automation.uo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver; //Global Variable
	
	@BeforeMethod
	public void launchBrowser() 
	{
		driver = new ChromeDriver(); // launch a chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void closeBrowser() 
	{
		driver.quit();
	}

	@Test (enabled = true)
	public void validate_loginfunc()
	{
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("Password123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test
	public void validate_signupfunc() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[@role='button' and @rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']\r\n")).sendKeys("1234567894");
		driver.findElement(By.xpath("//input[@type='password' and @class='inputtext _58mg _5dba _2ph-']")).sendKeys("Hello123");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Select dob_day = new Select(driver.findElement(By.name("birthday_day")));
		//dob_day.selectByIndex(4);
		//dob_day.selectByValue("5");
		dob_day.selectByVisibleText("5");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
		//driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
}
