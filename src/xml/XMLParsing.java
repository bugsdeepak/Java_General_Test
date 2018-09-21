package xml;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XMLParsing {
    
    //The Name of the Data source file (database properties)
    private static String DEFAULT_DS_FILE_PATH = "src/xml/test-ds.xml";

    //The root path - The Main Tag in xml
    private static String ROOT_XPATH = "//datasource";

    //The Tag that has the driver name
    private static String DRIVER_CLASS_XPATH = ROOT_XPATH
            + "/driver-class/text()";

    //The tag that has the connection url name
    private static String CONNECTION_URL_XPATH = ROOT_XPATH
            + "/connection-url/text()";

    //The tag that has the user name
    private static String USER_NAME_XPATH = ROOT_XPATH + "/user-name/text()";

    //The tag that has the password
    private static String PASSWORD_XPATH = ROOT_XPATH + "/password/text()";

    //the driver class name from db properties xml file
    private static String driverClassName = null;

    //the connection url from db properties xml file
    private static String connectionUrl = null;

    //the user name from db properties xml file
    private static String userName = null;

    //the password from db properties xml file 
    private static String password = null;
    
    public void parse() {

        //create the xml file object and parse it 
        File sourceFile = new File(DEFAULT_DS_FILE_PATH);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder builder = null;
        try {
            builder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document document = null;
        try {
            document = builder.parse(sourceFile);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();

        //read the database properties and assign to local variables.
        XPathExpression expression = null;
        Node result = null;
        try {
            expression = xpath.compile(DRIVER_CLASS_XPATH);
            result = (Node) expression.evaluate(document, XPathConstants.NODE);
            driverClassName = result.getTextContent();
            expression = xpath.compile(CONNECTION_URL_XPATH);
            result = (Node) expression.evaluate(document, XPathConstants.NODE);
            connectionUrl = result.getTextContent();
            expression = xpath.compile(USER_NAME_XPATH);
            result = (Node) expression.evaluate(document, XPathConstants.NODE);
            userName = result.getTextContent();
            expression = xpath.compile(PASSWORD_XPATH);
            result = (Node) expression.evaluate(document, XPathConstants.NODE);
            password = result.getTextContent();

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        System.out.println(driverClassName);
        System.out.println(connectionUrl);
        try {
			System.out.println(userName.getBytes("EUC-JP"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(password);
    }
    
    public static void main(String[] args) throws Exception {
        
        new XMLParsing().parse();
    }
}
