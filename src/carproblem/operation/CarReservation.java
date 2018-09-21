package carproblem.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import carproblem.exception.ReservationException;
import carproblem.type.Car;
import carproblem.type.CarType;
import carproblem.type.Customer;
import carproblem.type.Reservation;

public class CarReservation {
	
	private static final SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	private static final AtomicLong bookingIdGen = new AtomicLong();
	
	public boolean reserveCar(Customer c, CarType carType, String startDate, String endDate) throws ReservationException {
		boolean reservationStatus = false;
		
		Date startingDate;
		Date endingDate;
		long bookingId;
		
		try {
			startingDate = df.parse(startDate);
			endingDate = df.parse(endDate);
		} catch (ParseException e) {
			throw new ReservationException("Invalid Date Format : ", startDate, endDate);
		}
		
		if(c==null || carType == null) {
			throw new ReservationException("Customer/Car doesnot Exists : ", startDate, endDate);
		}
		
		if(startingDate.after(endingDate)) {
			throw new ReservationException("Start Date > End Date : ", startDate, endDate);
		}
		
		//check if a car is there in the store
		if(CarStore.getAvilableCarCount(carType) > 0) {
			//book the car for available
			Car car = CarStore.getAvilableCar(carType);
			if(car!= null) {
				car.setAvilable(false);
				car.setBooked(true);
				
				bookingId = bookingIdGen.incrementAndGet();
				Reservation reservation = new Reservation(bookingId, new Date(), startingDate, endingDate, c, car);
				reservationStatus = true;
			}
			
		} else {
			throw new ReservationException("Car Type: " + carType + " Is Not Avilable : ", startDate, endDate);
		}
		return reservationStatus;
	}

}
