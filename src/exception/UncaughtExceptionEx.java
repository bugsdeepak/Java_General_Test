package exception;

public class UncaughtExceptionEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//uncaugh exception is that is not handled by the code and
		//happens only at runtime.  the running thread is killed.
		System.out.println("This thread started .......");
		try {
			int list [] = new int [5];
			list[6] = 121;
		} catch (Throwable thr) {
			//thr.printStackTrace();
			System.out.println("Problem : " + thr);
			//Even thoug we can catch these type of problems that occure during
			//runtime, it is not recommented to user throwable here.
			//Better practise is to use the uncaughtException method of ThreadGroup.
			//see the example -  UncaughtExceptionExample.java
		}
		System.out.println("This thread executed properly.......");
	}
}
