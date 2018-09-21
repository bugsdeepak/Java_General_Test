package carproblem.type;

public class Customer {
	
	private String fullName;
	private String email;
	private String mobile;
	private String driverId;
	
	public Customer(String fullName, String email, String mobile, String driverid) {
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.driverId = driverid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getFullName() {
		return fullName;
	}
	
}
