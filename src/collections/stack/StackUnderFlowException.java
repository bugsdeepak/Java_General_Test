package collections.stack;

public class StackUnderFlowException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int stackSize;
	private String msg;
	
	StackUnderFlowException(int stackSize, String msg) {
		this.stackSize = stackSize;
		this.msg = msg;
	}
	
	public String toString() {
		return " Stack Under Flow Exception : Size = " + stackSize + " : " + msg;
	}

}
 