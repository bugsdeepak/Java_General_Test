package main.java.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadinProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		
		System.out.println(" Properties = " + props);
		
		Properties storedProps = new Properties();
		try {
			storedProps.load(new FileInputStream(
					new File("E:/Java_Code/Java_Test_Programs/general_test/resources.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for(int i=0; i<storedProps.size(); i++)
			storedProps.list(System.out);

	}

}
