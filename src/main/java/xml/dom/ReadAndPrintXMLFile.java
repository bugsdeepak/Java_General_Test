package main.java.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadAndPrintXMLFile {

    public static void main(String argv[]) {

        try {

        	/* A DOM Parser creates a tree structure in memory of the entire 
        	 * document and waits for request from client. 
        	 * 
        	 * DOM Parser - rich in functionality. It creates the DOM tree and
        	 * we can access any part of the document repeatedly & we can modify
        	 * the DOM tree.
        	 * 
        	 * But space insufficient when document is huge.
        	 * 
        	 * A tree-based API provides interfaces on components of a tree (which is a DOM document) 
        	 * such as Document interface, Node interface, NodeList interface, 
        	 * Element interface, Attr interface and so on.*/
        	
        	
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
                    .newInstance();
            //the following method throws ParserConfigurationException;
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            //the following method throws SAXException, IOException
            Document doc = docBuilder.parse(new File("src/main.java.xml/dom/book.main.java.xml"));

            // normalize text representation doc.getDocumentElement ().normalize
            // ();
            System.out.println("Root element of the doc is "
                    + doc.getDocumentElement().getNodeName());

            NodeList listOfPersons = doc.getElementsByTagName("person");
            int totalPersons = listOfPersons.getLength();
            System.out.println("Total no of people : " + totalPersons);

            for (int s = 0; s < listOfPersons.getLength(); s++) {

                Node firstPersonNode = listOfPersons.item(s);

                if (firstPersonNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element firstPersonElement = (Element) firstPersonNode;
                    // -------
                    NodeList firstNameList = firstPersonElement.getElementsByTagName("first");
                    Element firstNameElement = (Element) firstNameList.item(0);

                    NodeList textFNList = firstNameElement.getChildNodes();
                    System.out
                            .println("First Name : "
                                    + ((Node) textFNList.item(0))
                                            .getNodeValue().trim());

                    // -------
                    NodeList lastNameList = firstPersonElement
                            .getElementsByTagName("last");
                    Element lastNameElement = (Element) lastNameList.item(0);

                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out
                            .println("Last Name : "
                                    + ((Node) textLNList.item(0))
                                            .getNodeValue().trim());

                    // ----
                    NodeList ageList = firstPersonElement
                            .getElementsByTagName("age");
                    Element ageElement = (Element) ageList.item(0);

                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("Age : "
                            + ((Node) textAgeList.item(0)).getNodeValue()
                                    .trim());

                    // ------

                }// end of if clause

            }// end of for loop with s var

        } catch (SAXParseException err) {
            System.out.println("** Parsing error" + ", line "
                    + err.getLineNumber() + ", uri " + err.getSystemId());
            System.out.println(" " + err.getMessage());

        } catch (SAXException e) {
            Exception x = e.getException();
            ((x == null) ? e : x).printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
