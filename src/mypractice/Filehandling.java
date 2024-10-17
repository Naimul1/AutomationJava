package mypractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Filehandling {
	
	public static void readprop() throws Exception 
	{
		//File f = new File("./MyTestData/myxyz.txt");
		FileReader fr = new FileReader("./MyTestData/myconfig.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("Selenium"));
		System.out.println(prop.get("Language"));
	}

	public static void writedata() throws Exception 
	{
		//File f = new File("./MyTestData/myxyz.txt");
		FileWriter fw = new FileWriter("./MyTestData/myxyz.txt", true);
		fw.write("\nThis is third line");
		fw.flush();
		fw.close();
	}
	
	public static void readdata() throws Exception 
	{
		File f = new File("./MyTestData/myabc.txt");
		FileReader fr = new FileReader(f);
		int r = fr.read();
		while (r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
	}
	public static void main(String[] args) throws Exception {
		readprop();
	}
}
