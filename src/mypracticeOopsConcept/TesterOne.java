package mypracticeOopsConcept;

public class TesterOne { //multiple methods in one class then calling those methods by crating object of the class in main methods

	public void sum () 
	{
	int a = 10;
	int b = 15;
	int c = a+b; 
	System.out.println("This is Sum witout parameter: " + c);
	}
	
	public void sum(int a, int b) 
	{
		int c = a+b;
		System.out.println("This is Sum with two input parameter on method declaration: " +c);
	}
	
	public float sum(int a, float b) 
	{
		float c = a+b;
		System.out.println("This is Sum with two input parameter on method declaration using float: " +c);
		return b;
	}
	
	public void sum(int a, int b, int c) 
	{
		int d = a+b+c;
		System.out.println("This is Sum with three input parameter on method declaration: " +d);
	}
	
	public void sub(int a, int b) 
	{
		int c = a-b;
		System.out.println("This is Sub: " +c);
	}
	
	public void multipl(int a, int b) 
	{
		int c = a*b;
		System.out.println("This is Multiplication: " +c);
	}
	
	public void div(int a, int b) 
	{
		int c = a/b;
		System.out.println("This is Divition: " +c);
	}
	
	public static void main(String[] args) 
	{
		TesterOne tOne = new TesterOne();
				tOne.sum();
				tOne.sum(5, 10);
				tOne.sum(5, 1.5f);
				tOne.sum(10, 15, 20);
				tOne.sub(15, 4);
				tOne.multipl(10, 15);
				tOne.div(50, 5);
	}

}
