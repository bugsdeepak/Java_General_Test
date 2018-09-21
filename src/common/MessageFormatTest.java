package common;

import java.text.MessageFormat;

public class MessageFormatTest {
	
	public void printFormattedString() {
		try {
			int i = 1/0;
		} catch (Exception ex) {
			Object args1 [] = { this.getClass().getName(), ex };
			System.out.println("Format = " + MessageFormat.format("This error happened in {0} and exception : {1}", args1));
			System.out.println("Format = This error happened in " + this.getClass().getName() + " and exception : " + ex );
			//ex.printStackTrace();
		}
	}
	
	public void printDiffFormat() {
		
		Object arguments [] = { "first", "second" };
		String formatStr = MessageFormat.format("XXX - target of null "
                   + "not implemented for", arguments);
		System.out.println("Formatted  = " + formatStr);
		
		String key = "An {0} Error {1} ";
		Object arg1 = "1St";
		int port = 9090;
		Object args [] = {arg1, port}; 
		System.out.println("New Format = " + MessageFormat.format(key, args));
	}
	
	public static void main(String[] args) {
		
		String key = "An {0} Error {1} Message {2}{3}";
		Object [] arguments = {"hello" , 2, 3,"p"};
		System.out.println("Format = " + MessageFormat.format(key, arguments));
		new MessageFormatTest().printFormattedString();
		new MessageFormatTest().printDiffFormat();
	}
}
