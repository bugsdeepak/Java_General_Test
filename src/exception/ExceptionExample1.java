package exception;

public class ExceptionExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int mark = 102;
		
		//this method throws check exception - custom excetpiton
		//that extends Exception.
		checkMark(mark);
		
		//throws unchecked exception i.e runtime exception. So we 
		//do not have to put in try - catch or throws clause.
		checkMarkAgain(mark);

	}
	
	public static void checkMark(int mark) {

		try {
			if(mark > 100)
				throw new MarkOutOfRangeException(mark + " Out Of Range.");
			
		} catch (MarkOutOfRangeException ex) {
			ex.printStackTrace();
			System.out.println("Problem ... " + ex);
		}
	}
	
	private static void checkMarkAgain(int mark) {
		
		if(mark > 100)
			throw new WrongMarkException(mark + " Out Of Range.");
		
	}

}
