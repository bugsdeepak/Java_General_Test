package xml.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserExample extends DefaultHandler {

	//The SAX parsing is based on even handling module. And, does not create
	//any internal structure in memory.
	
	//it takes the occurrences of components (of an input document) as events, 
	//and tells the client what it reads as it reads through the input document.
	
	//Use SAX parsing, when readin (parsing) huge XML document and
	//structural changes are not required. We cannot navigate back and forth, XML document.
	
	//There are four handler interfaces, ContentHandler interface, DTDHandler interface, 
	//EntityResolver interface and ErrorHandler interface.
	
	//SAX parser runs faster, but provides only fewer functionalities.
	
	//When a SAX parser parses the document and every time it encounters
	//a tag it calls the corresponding tag handler methods.
	
	//when encounters a Start tag  "<employee>" it calls
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("Start Tag Encountered = " + qName /* + attributes */ );
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
		
		try {
			
			//get an instance of the SAX Parser
			SAXParser sp = spf.newSAXParser();
			
			//parse the file and also register this class for callbacks.
			sp.parse("E:/Java_General_Test/src/xml/sax/employee.xml", new SaxParserExample());
			
			System.out.println(" This parser validates the XML document ? : " +  sp.isValidating() );
			
			
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

}
