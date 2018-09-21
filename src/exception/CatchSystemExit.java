package exception;

public class CatchSystemExit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = null;
		try {
			str.charAt(0);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("This is inside catch block ");
			System.exit(0);
		} finally {
			System.out.println("This is in the finally blcok ");
		}
	}

}
