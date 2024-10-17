package oopsConcepts;

public class Qa3 extends Qa2 {
	
	public void multi (int a, int b) 
	{ 
		int c = a*b;
		System.out.println("Multiplication: " + c);
	}
	public static void main(String[] args) 
	{
		Qa3 q3 = new Qa3();
		q3.multi(25, 20);
		q3.sub(20, 5);
//		q3.sum(10, 15);

	}

}
