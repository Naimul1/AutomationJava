package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario4 
{
	@Test
	public void first_testcase() 
	{
		System.out.println("This is my first test case");
	}
	
	@Test
	public void second_testcase() 
	{
		System.out.println("This is my second test case");
	}
	
	@Test
	public void third_testcase() 
	{
		System.out.println("This is my third test case");
	}
	
	@Test
	public void forth_testcase() 
	{
		System.out.println("This is my forth test case");
	}
	
	@Test
	public void fifth_testcase() 
	{
		System.out.println("This is my fifth test case");
	}
	
	@Test
	public void sixth_testcase() 
	{
		System.out.println("This is my sixth test case");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public void seventh_testcase() 
	{
		System.out.println("This is my seventh test case");
	}
}
