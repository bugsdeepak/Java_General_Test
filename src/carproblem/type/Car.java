package carproblem.type;

public class Car {
	
	private CarType carType; 
	private String model;
	private String regNo;
	//The car will not be available when reservation is in process, car in use, car is serviced. 
	private boolean isAvilable;
	//The car can be booked only when available. 
	private boolean isBooked;
	
	public Car(CarType carType, String model, String regNo) {
		this.carType = carType;
		this.model = model;
		this.regNo = regNo;
		this.isAvilable = true;
		this.isBooked = false;
	}

	public boolean isAvilable() {
		return isAvilable;
	}

	public void setAvilable(boolean isAvilable) {
		this.isAvilable = isAvilable;
	}

	public CarType getCarType() {
		return carType;
	}

	public String getModel() {
		return model;
	}

	public String getRegNo() {
		return regNo;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}	
}
