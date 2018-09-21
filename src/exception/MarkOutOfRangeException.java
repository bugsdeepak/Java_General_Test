package exception;

/*
 * This class is an example for customized checked exception
 * If the client code throws this exception then is should be
 * surrounded in try-catch or delcraed in throws clause. 
 */
public class MarkOutOfRangeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String errMsg ;
	private String errCode ;
	
	public MarkOutOfRangeException() {
		this.errCode = "";
		this.errCode = "";
	}
	
	public MarkOutOfRangeException(String errMsg) {
		super(errMsg);
		this.errMsg = errMsg;
		this.errCode = "";
	}
	
	public MarkOutOfRangeException(String errMsg, String errCode) {
		super(errMsg);
		this.errMsg = errMsg;
		this.errCode = errCode;
	}
	
	public String toString() {
		return errMsg + errCode;
	}

}
