package org.testingworldautomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.log.model.ViolationSetting.Name;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataCompare 
{
	@Test (enabled=true)
	public void login_page() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//step 1
		String expURL = "https://thetestingworld.com/testings/";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertEquals(actURL, expURL);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actURL, expURL);
		System.out.println("step 1 failed");
		
		//step 2
		String expTitle = "Login & Sign Up Forms";
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		sa.assertEquals(actTitle, expTitle, "Tittle didn't match");
		
		String expvalue_fldusername = "myusername";
		String actvalue_fldusername = driver.findElement(By.name("fld_username")).getAttribute("placeholder");
		System.out.println(actvalue_fldusername);
		
		sa.assertEquals(actvalue_fldusername, expvalue_fldusername);
		
		String expReadDetails = "Read Detail";
		String actReadDetails = driver.findElement(By.className("displayPopup")).getText();
		System.out.println(actReadDetails);
		sa.assertEquals(actReadDetails, expReadDetails);
		
		boolean signUpBttn = driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
		System.out.println(signUpBttn);
		Assert.assertEquals(signUpBttn, true);
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		//sa.assertAll();
		
		driver.close();
	}
}
