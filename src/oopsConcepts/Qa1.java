package oopsConcepts;

public class Qa1 {

	public void sum (int a, int b) 
	{ 
		int c = a*a+b*b;
		System.out.println("Sum with two peremeter/argumets: " + c);
	}
	public void sum (int a, int b, int c) 
	{ 
		int d = a+b+c;
		System.out.println("Sum with three peremeter/argumets: " + d);
	}
	public void sum (int a, float b) 
	{ 
		float c = a+b;
		System.out.println("Sum with float peremeter/argumets: " + c);
	}
	
	public static void main(String[] args) 
	{
		Qa1 q1 = new Qa1();
		q1.sum(10, 20);
		q1.sum(10, 15, 10);
 
	}

}
 