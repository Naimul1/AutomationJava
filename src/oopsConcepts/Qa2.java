package oopsConcepts;

public class Qa2 implements Qa1I {
	

	public void sub (int a, int b) 
	{ 
		int c = a-b;
		System.out.println("Subtraction: " + c);
	}
	public static void main(String[] args) 
	{
		Qa2 q2 = new Qa2();
		q2.sub(25, 20);
//		q2.sum(25, 10);
		q2.qa1im();

	}
	
	public void qa1im() 
	{
		System.out.println("This method is from Qa1I Interface: ");
		
	}

}
