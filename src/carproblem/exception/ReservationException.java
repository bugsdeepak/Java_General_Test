package carproblem.exception;

public class ReservationException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String errMsg;
	private String startDate;
	private String endDate;
	
	public ReservationException(String errMsg, String startDate, String endDate) {
		this.errMsg = errMsg;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}
	
	public String toString() {
		return new StringBuffer("Error Messge : ").append(errMsg).append(" Start Date : ").append(startDate).
				append(" End Date : ").append(endDate).toString();
	}

}
