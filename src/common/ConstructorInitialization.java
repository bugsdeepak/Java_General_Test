package common;

import java.io.IOException;

@SuppressWarnings("unused")
public class ConstructorInitialization {

	private final String str;
	private final Object obj;
	
	//the constructor like other methods can be declared for throws
	public ConstructorInitialization(int i) throws IOException {
		obj = new Object();
		str = "Constant";
	}
	
	private ConstructorInitialization() {
		//We can initialize the final fileds in the constructor
		
		str = "Constant String";
		obj = new Object();
	}
	
	//we can have method name as the Constructor name
	public void ConstructorInitialization() {
		
	}
	
	public static void main(String[] args) throws Exception {
		//we can restrict the user that if he want to create an object of
		//this class [], they have to pass the integer variable.
		new ConstructorInitialization(23);
	}
}
