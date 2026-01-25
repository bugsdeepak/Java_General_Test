package main.java.core.errors;

public class ClassFormatErrorTest {
	
	/* ClassFormatError is thrown when the JVM can not read the .class file
	 * properly. Hence go to the location where the class file for this java file
	 * exits and edit the contents delete some byte code and save it. Now when
	 * you execute the class file you will get ClassFormatError. A snapshot
	 * java.lang.ClassFormatError: Invalid method attribute name index 0 in class file main.java.common/CloneTest
	    at java.lang.ClassLoader.defineClass1(Native Method)
	    at java.lang.ClassLoader.defineClass(Unknown Source)
	    at java.security.SecureClassLoader.defineClass(Unknown Source) */
	public static void main(String[] args) {
		System.out.println("Hello THere");
	}

}
