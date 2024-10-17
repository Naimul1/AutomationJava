package oopsConcepts;

public class T1 extends AbsClassDemo 
{
	
	public void m2() 
	{
		System.out.println("This is my fb credentials ");		
	}

	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		t1.m1();
		t1.m2();
	}
}
//here your Parent class is Abstract class(AbsClassDemo) but your child class is concrete class(T1) 