package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario3 
{
	@Test (groups="Smoke")
	public void first_testcase() 
	{
		System.out.println("This is my first test case");
	}
	
	@Test (groups="Regressin")
	public void second_testcase() 
	{
		System.out.println("This is my second test case");
	}
	
	@Test (groups={"Regressin","Sanity"})
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
	}
	
	@Test
	public void seventh_testcase() 
	{
		System.out.println("This is my seventh test case");
	}
}
