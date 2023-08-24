package HandlingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingwithProperties {
	
	public static void main(String[] args) throws IOException  {
		// give the path of the file
		File f = new File("F:\\for_javaprograms\\My first project\\selenium basics\\properties\\Data.properties");
		
		//read the data
		FileInputStream fis = new FileInputStream(f);
		
		//To handle the properties file
		Properties prop = new Properties();
		prop.load(fis);
		
		//to get the value we need to use key name and use getproperty,method
		String name = prop.getProperty("userName");
		System.out.println("The name vale is = "+name);
		
		String pass = prop.getProperty("password");
		System.out.println("The password value is = " +pass);
	}

}
