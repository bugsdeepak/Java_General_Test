package common;


public class ObjectArgTest {
	
	public static void printHELLO() {
		System.out.println("Hello brother");
	}
	
	private static void function1(Object args[]) {
		
		for(Object obj: args) {
			System.out.println("Value = " + obj);
		}
		
	}
	
	public static void main(String[] args) {
		int i = 12;
		int j= 90;
		Object values[] = {12, 13, 32, i, j };
		function1(values);
	}

}
