package mypractice;

public class Mathematics {
	
	public void addition() //method with no return type (thats why it has void in method)
	{
		int a = 5;
		int b = 15;
		int c = a+b;
		
		System.out.println("Addition answer is: "+c);
	}
	public int additionTwo() //this method with no parameter/argument but this method is with return type. 
	{
		int a = 5;
		int b = 15;
		int c = a+b;
		System.out.println("Method with return type & argumet: " +c);
		return b;
	}
	
	public void sum (int a, int b) //this method is with parameter/argument 
	{
		int c = a+b;
		
		System.out.println("Sum answer is: " +c);
	}
	
	public void subtraction() //method
	{
		int a = 50;
		int b = 15;
		int c = a-b;
		
		System.out.println(c);
	}
	public void multiplication() //method
	{
		int a = 5;
		int b = 15;
		int c = a*b;
		
		System.out.println(c);
	}
	public void divition() //method
	{
		int a = 100;
		int b = 15;
		int c = a/b;
		System.out.println(c);
	}

	public static void main(String[] args) //this is main method
	{ 
		Mathematics dev = new Mathematics();
		dev.addition();
		dev.sum(15, 15);
		int x = dev.additionTwo();
		System.out.println(x);

	}

}
