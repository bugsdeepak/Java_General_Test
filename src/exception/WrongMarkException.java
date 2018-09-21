package exception;

/*
 * This class is an example for customized unchecked exception
 * If the client code throws this exception then there is no need to
 * surround in try-catch or delcraed in throws clause. 
 */
public class WrongMarkException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String errMsg ;
	private String errCode ;
	
	public WrongMarkException() {
		this.errCode = "";
		this.errCode = "";
	}
	
	public WrongMarkException(String errMsg) {
		super(errMsg);
		this.errMsg = errMsg;
		this.errCode = "";
	}
	
	public WrongMarkException(String errMsg, String errCode) {
		super(errMsg);
		this.errMsg = errMsg;
		this.errCode = errCode;
	}
	
	public String toString() {
		return errMsg + errCode;
	}

}
