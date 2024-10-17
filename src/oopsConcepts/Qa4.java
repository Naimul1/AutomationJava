package oopsConcepts;

public class Qa4 extends Qa2 implements Qa3I {
	
	public void div (int a, int b) 
	{ 
		int c = a/b;
		System.out.println("Divition: " + c);
	}
	public static void main(String[] args) 
	{
		Qa4 q4 = new Qa4();
		q4.div(20, 2);
//		q3.multi(25, 20);
		q4.sub(20, 5);
//		q4.sum(10, 15);
		q4.qa3im();

	}
	
	public void qa3im() 
	{
		System.out.println("This is method of Qa3I interface: ");
	}

}
