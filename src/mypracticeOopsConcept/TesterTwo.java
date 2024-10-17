package mypracticeOopsConcept;

public class TesterTwo extends TesterOne { //this is inharitance using exteds key word

	public void sum1 () 
	{
	int a = 5;
	int b = 15;
	int c = a+b; 
	System.out.println("This is witout parameter: " + c);
	}
	
	public void sum1 (int a, int b) 
	{
		int c = a+b;
		System.out.println("This is with two input parameter on method declaration: " +c);
	}
	
	public static void main(String[] args) 
	{
		TesterTwo tTwo = new TesterTwo();
				tTwo.sum1();
				tTwo.sum1(5, 10);
				tTwo.sub(100, 10);
				tTwo.multipl(5, 10);
				
	}

}
