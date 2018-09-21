package common;

import java.util.ArrayList;
import java.util.List;

public class ConstructorFinalTest {

	private final int i;
	private final List list;
	
	public ConstructorFinalTest() {
		//the value for a final instance variable can be given when constructing.
        //if we dont then we get the following compilation error
		//"The blank final field str may not have been initialized"
		i = 100;
		list = new ArrayList();
	}
	
	public void printValues() {
		System.out.println(" i = " + i);
		System.out.println(" Array List = " + list);
	}
	
	public static void main(String[] args) {
		new ConstructorFinalTest().printValues();
	}
}
