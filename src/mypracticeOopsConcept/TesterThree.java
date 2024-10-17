package mypracticeOopsConcept;

public class TesterThree extends TesterTwo { //this is inharitance using exteds key word

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
		TesterThree tThree = new TesterThree();
			tThree.sum1();
			tThree.sum1(5, 10);
			tThree.sub(100, 10);
			tThree.multipl(5, 10);
			tThree.div(10, 2);
				
	}

}
