package mypractice;

public class Hello {
	
	int i = 12;
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = false;
	
	public void myInfo() 
	{
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
		//System.out.println(e);
		
	} 

	public static void main(String[] args) 
	{
		
		Hello xyz = new Hello();
				xyz.myInfo();
				
	}

}
