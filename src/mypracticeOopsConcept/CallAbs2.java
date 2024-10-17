package mypracticeOopsConcept;
//Example of abstract method
public class CallAbs2 extends AbstrClass {
	
	public void M2() 
	{
		System.out.println("This is my Instagram credential: ");
	}
	
	public static void main(String[] args) {
		CallAbs2 ca2 = new CallAbs2();
		ca2.M1();
		ca2.M2();
	}

}
