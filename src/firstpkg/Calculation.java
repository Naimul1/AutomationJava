package firstpkg;

public class Calculation {
	
//	public Calculation() //class name and constructor name will always be same
//	{
//		System.out.println("This is a constructor");
//		
//			int a = 20;
//			int b = 30; 
//			int c = a+b; 
//			
//			System.out.println("Sum of a&b: " + c);
//	}
	
	public Calculation(int a, int b) //this constructor is with input
	{
		int c = a+b;
		System.out.println("This is sum of a&b with input constructor: " + c);
	}
	
	public void addition () {
		int a = 10;
		int b = 30; 
		int c = a+b; 
		
		System.out.println("Sum of a&b: " + c);
	}
	
	public int additionTwo () {
		int a = 20;
		int b = 40; 
		int c = a+b; 	
		System.out.println("additionTwo of a&b: " + c);	
		return b;
	}
	
	public void sum (int a, int b) {
		 
		int c = a+b; 
		
		System.out.println("Sum of a&b: " + c);
	}
	
//	public int sumone (int a, int b) {
//		 
//		int c = a+b; 
//		
//		System.out.println("Sumone of a&b: " + c);
//		return c;
//	}
	
	public void substraction () {
		int a = 40;
		int b = 5; 
		int c = a-b; 
		
		System.out.println("Sub of a&b: " + c);
	}
	
	public void multiplication () {
		int a = 20;
		int b = 30; 
		int c = a*b; 
		
		System.out.println("Multiplication of a&b: " + c);
	}
	
	public void divition () {
		int a = 25;
		int b = 3; 
		int c = a/b; 
		
		System.out.println("Div of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
		
		Calculation cal = new Calculation(10,15);
//		Calculation cal = new Calculation();
		cal.addition();
//		cal.substraction();
//		cal.multiplication();
//		cal.divition();
//		cal.sum(50, 50);
//		cal.sumone(20, 10)
//		int x = cal.additionTwo();
//		System.out.println(x);
	}

}
