package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{
	@Test (priority=1)
	public void first_testcase() 
	{
		System.out.println("This is my first test case");
		
		Assert.assertEquals("Hello", "Hello");
		Assert.assertEquals(true, false, "thhis validation failed");
	}
	
	@Test (priority=2)
	public void second_testcase() 
	{
		System.out.println("This is my second test case");
		
	}
	
	@Test (priority=3)
	public void third_testcase() 
	{
		System.out.println("This is my third test case");
	}
	
	@Test(enabled=false)
	public void forth_testcase() 
	{
		System.out.println("This is my forth test case");
	}
	
	@Test (priority=4)
	public void fifth_testcase() 
	{
		System.out.println("This is my fifth test case");
	}
	
	@Test (priority=-1)
	public void sixth_testcase() 
	{
		System.out.println("This is my sixth test case");
	}
	
	@Test (priority=-2)
	public void seventh_testcase() 
	{
		System.out.println("This is my seventh test case");
	}
}
