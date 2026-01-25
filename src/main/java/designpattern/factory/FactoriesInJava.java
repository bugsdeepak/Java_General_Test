package main.java.designpattern.factory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class FactoriesInJava {

	public static void main(String[] args) {
		
		//first we get the instance of the factory.
		DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
		
		//then we make some settings on the factory.
		factory.setNamespaceAware(true);
		factory.setValidating(true);
		factory.setExpandEntityReferences(true);

		//after this we get the document builder from the factory.
		//So, what ever settings we did in the previous step. Based on which
		//we get an instance of DocumentBuilder. So based on the input (settings)
		//the object is defined. Even though, the same object "DocumentBuilder" is
		//returned each time, its behaviour changes.
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			System.out.println("DOM Builder details = " + builder);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
