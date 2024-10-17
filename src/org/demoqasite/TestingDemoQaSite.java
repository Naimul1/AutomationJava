package org.demoqasite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingDemoQaSite 

{
	//WebDriver driver;
	@Test
	public void homePage() 
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Tester1");
		driver.findElement(By.id("userEmail")).sendKeys("Tester1@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("200 Will Ave");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("200 Will Ave");
	//	driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[2]")).click();
		driver.findElement(By.className("rct-checkbox")).click();
		
	}
	
}
