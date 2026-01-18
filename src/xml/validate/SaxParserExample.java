package xml.validate;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;
//import com.sun.org.apache.xerces.internal.jaxp.validation.xs.SchemaFactoryImpl;

public class SaxParserExample extends DefaultHandler {/*

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("Start Tag Encountered = " + qName  + attributes  );
	}
	
	//when encounters a End tag "</employee>" it calls
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("End Tag Encountered = " + qName); 
	}
	
	//Receive notification of character data inside an element.
	public void characters(char ch[], int start, int length) throws SAXException {
		System.out.println("CDATA Encountered = " + new String(ch, start, length));
	}

	public static void main(String[] args) {
 
		//get a factory
		SAXParserFactory spf = SAXParserFactory.newInstance();
		
		//Source schemaSource = new SchemaFactoryImpl();
		
		SchemaFactory schemaFact  = SchemaFactory.newInstance("DTD");
		
		Schema schema = null;
		try {
			schema = schemaFact.newSchema();
		} catch (SAXException e1) {
			e1.printStackTrace();
		}
		
		//We can set the XML validation on the factory itself.
		spf.setValidating(true);
		
		//but to really validate we have to set the schema/grammar/rules
		//for the xml document
		spf.setSchema(schema);
		
		

		try {
			
			//
			System.out.println(" This parser factory validates the XML document ? : " +  spf.isValidating() );
			
			//get an instance of the SAX Parser. All the SAXParser instances created
			//this factory should have the same properties of the factory itself 
			//For exmaple XML validation
			SAXParser sp = spf.newSAXParser();
			
			System.out.println(" This parser factory validates the XML document ? : " +  spf.isValidating() );
			
			//parse the file and also register this class for callbacks.
			sp.parse("E:/Java_General_Test/src/xml/sax/employee.xml", new SaxParserExample());
			
			
			
			
		} catch (SAXException sae) {
			System.out.println("Error : " + sae);
		    //sae.printStackTrace();
		} catch (ParserConfigurationException e) {
			System.out.println("Error : " + e);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error : " + e);
			//e.printStackTrace();
		}
	}

*/}
