package firstpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.DomainCombiner;
import java.util.Properties;
//used static method benefit of it is you don't need to create object of the class 
//you can directly call the method name if you're in the class 
public class Filehandling 
{
	
	public static void readprop() throws Exception 
	{
		File f = new File("./TestData/config.properties");
		
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("Selenium"));
		System.out.println(prop.get("Name"));
		System.out.println(prop.get("URL"));
		
		
	}
	
	public static void writedata() throws Exception 
	{
		File f = new File("./TestData/xyz.txt");
		
		FileWriter fw = new FileWriter(f, true);
		
		fw.write("\nThis is forth line");
		
		fw.flush();
		fw.close();
	}
	
	public static void readdata() throws Exception 
	{
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read(); //
		
		while(r!=-1) 
		{
			System.out.print((char)r);
			r = fr.read();
		}	
	}
	
	public static void main(String[] args) throws Exception {
		
		readprop();
	}
}
