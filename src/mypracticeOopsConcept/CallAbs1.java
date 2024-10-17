package mypracticeOopsConcept;
//Example of abstract method
public class CallAbs1 extends AbstrClass {
	
	public void M2() 
	{
		System.out.println("This is my Facebook credential: ");
	}
	
	public static void main(String[] args) {
		CallAbs1 cb1 = new CallAbs1();
		cb1.M1();
		cb1.M2();
	}

}
