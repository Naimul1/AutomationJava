package org.xyz.automation.uo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardMouse 
{
	WebDriver driver; //Global Variable
	
	@Test
	public void handleFrames() throws Exception 
	{
		driver = new ChromeDriver(); // launch a chrome browser
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		CaptureScreenShot.takeResults(driver, "handleFrames_1");
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenShot.takeResults(driver, "handleFrames_2");
		
	}
	
	@Test(enabled = false)
	public void handleAlerts() 
	{
		driver = new ChromeDriver(); // launch a chrome browser
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
	}
	
	@Test(enabled = false)
	public void mouseHandle() 
	{
		driver = new ChromeDriver(); // launch a chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
	//	act.click(driver.findElement(By.xpath("//a[text() = 'Our Approach']"))).perform();
	//	act.doubleClick(driver.findElement(By.xpath("//a[text() = 'Our Approach']"))).perform();
	//	act.contextClick(driver.findElement(By.xpath("//a[text() = 'Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text() = 'Industries']"))).perform();
	//	act.click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).keyUp(Keys.CONTROL).perform();
		Set<String> windId = driver.getWindowHandles();
		Iterator<String> itr = windId.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
	//	driver.switchTo().window(win1);
	//	driver.quit();
	}
	
	
	@Test (enabled = false)
	public void keyboardHandle() 
	{
		driver = new ChromeDriver(); // launch a chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		act.sendKeys("User1");
		act.sendKeys(Keys.PAGE_DOWN).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
//		act.sendKeys(Keys.TAB).perform();
//		act.sendKeys("Password1").perform();
//		act.sendKeys(Keys.ENTER).perform();
	}
	
}
