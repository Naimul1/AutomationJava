package oopsConcepts;

public abstract class AbsClassDemo 
{
	public void m1()
	{
		System.out.println("This method is called concrete method");
	}
	
	public abstract void m2();
// we use abstract to hide data 
// for Abstract Method your class has to be Abstract 
// the moment you create abstract of class you can not create object/instance of the class  
// you always keep your Abstract method Empty in parent class but when you call that method in another class then add your own body, we use this to hide data/credentials 
}
