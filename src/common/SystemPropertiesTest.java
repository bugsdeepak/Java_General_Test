package common;

import java.util.Enumeration;
import java.util.Properties;

public class SystemPropertiesTest {
	
	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		props.list(System.out);
		
		Enumeration propNames = props.propertyNames();
		//for(P);
	}

}
