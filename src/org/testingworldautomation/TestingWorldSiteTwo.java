package org.testingworldautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.log.model.ViolationSetting.Name;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingWorldSiteTwo 
{

	WebDriver driver; 
	
	@BeforeMethod
	public void launchBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		//driver.quit();
	}
	
	@Test (enabled=true)
	public void registration_page() throws InterruptedException 
	{
		
		driver.findElement(By.name("fld_username")).sendKeys("Naimul");
		driver.findElement(By.name("fld_email")).sendKeys("Naimul@gmail.com");
		driver.findElement(By.name("fld_password")).sendKeys("Naimul1");
		driver.findElement(By.name("fld_cpassword")).sendKeys("Naimul1");
		driver.findElement(By.cssSelector("[id='datepicker']")).sendKeys("10/16/1995");
		driver.findElement(By.xpath("//a[text()='16']")).click();
		driver.findElement(By.name("phone")).sendKeys("1234567891");
		driver.findElement(By.name("address")).sendKeys("15 Avenue H");
		driver.findElement(By.xpath("//input[@name='add_type' and @value='office']")).click();
		Select gender = new Select(driver.findElement(By.name("sex")));
		gender.selectByVisibleText("Male");
		//Select select_country = new Select(driver.findElement(By.id("countryId")));
		//select_country.selectByIndex(231);
		Select count = new Select (driver.findElement(By.name("country")));
		count.selectByVisibleText("United States");
		//Thread.sleep(5000);
		//Select select_state = new Select(driver.findElement(By.name("state")));
		//select_state.selectByIndex(38);
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		st.selectByVisibleText("New York");
		
		Select ct = new Select (driver.findElement(By.name("city")));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.name("city")), "Freeport"));
		ct.selectByVisibleText("Clifton Park");
		
		//Thread.sleep(5000);
		//Select select_city = new Select(driver.findElement(By.id("cityId")));
		//select_city.selectByIndex(40);
		driver.findElement(By.name("zip")).sendKeys("11223");
		driver.findElement(By.xpath("//div[@id='tab-content1']/form/div/input[1]")).click();
		driver.findElement(By.xpath("//input[@type='submit'and@value='Sign up']")).click();
		//gender.selectByValue("10");
		//dob_day.selectByIndex(4);
		//dob_day.selectByValue("5");
		//dob_day.selectByVisibleText("5");
	}
	
	@Test (enabled=false)
	public void login_page() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/testings/");
		driver.findElement(By.xpath("//label[@for='tab2']")).click();
		WebElement uname = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
		uname.sendKeys("Naimul1");
		//driver.findElement(By.xpath("//input[@name='_txtUserName']")).sendKeys("Naimul");
		driver.findElement(By.xpath("//input[@name='_txtPassword']")).sendKeys("Hello");
		driver.findElement(By.xpath("//div[@id='tab-content2']/form/div/input[1]")).click();
		driver.findElement(By.xpath("//input[@type='submit'and@value='Sign up']")).click();
		
	}
}
