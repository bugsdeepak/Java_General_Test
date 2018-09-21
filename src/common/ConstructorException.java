package common;

public class ConstructorException {
	
	private int i = 0;
	private String str = "";
	
	ConstructorException(int i, String str, boolean throwError) throws Exception {
		this.i = i;
		if(throwError)
			throw new Exception("some error");
		this.str = str;
	}
	
	public void printValues() {
		System.out.println("Integer value = " + i);
		System.out.println("String value = " + str);
	}

	public static void main(String[] args) {
	
		ConstructorException obj2 = null;
		try {
			
			ConstructorException obj1 = new ConstructorException(12, "Romesh", false);
			obj1.printValues();
			
			obj2 = new ConstructorException(1, "Vidvani", true);
			obj2.printValues();
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if(obj2 == null) {
				System.out.println("On exception in Constructor, object is not all constructed");
			} else {
				System.out.println("On exception in Constructoer, object is constructed");
				obj2.printValues();
			}
				
		}
		

	}

}
