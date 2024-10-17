package firstpkg;

public class BasicJava {

	int a = 10;
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = false; 
	
	public void readdata()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	
	}
	
	public static void main(String[] args) {
		
		BasicJava abc = new BasicJava ();
		abc.readdata();
	}
			
}
