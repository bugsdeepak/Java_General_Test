package carproblem.test;

import carproblem.exception.ReservationException;
import carproblem.operation.CarReservation;
import carproblem.operation.CarStore;
import carproblem.type.Car;
import carproblem.type.CarType;
import carproblem.type.Customer;

public class CarReservationTest {

	public static void main(String[] args) {
		
		CarReservation reservation = new CarReservation();
		
		//Create new cars
		Car s1 = new Car(CarType.SEDAN, "2016", "CA2345");
		Car s2 = new Car(CarType.SEDAN, "2017", "NJ3245");
		Car s3 = new Car(CarType.SEDAN, "2018", "NJ9834");
		Car su1 = new Car(CarType.SUV, "2012", "AL2344");
		Car su2 = new Car(CarType.SUV, "2016", "MA24524");
		Car v1 = new Car(CarType.VAN, "2010", "TX1334");
		Car v2 = new Car(CarType.VAN, "2012", "WA8979");
		
		//Add cars to the store
		CarStore.addCar(CarType.SEDAN, s1);
		CarStore.addCar(CarType.SEDAN, s2);
		CarStore.addCar(CarType.SEDAN, s3);
		CarStore.addCar(CarType.SUV, su1);
		CarStore.addCar(CarType.SUV, su2);
		CarStore.addCar(CarType.VAN, v1);
		CarStore.addCar(CarType.VAN, v2);
		
		//Create Customers
		Customer antony = new Customer("Antony Benedict", "antony@gmail.com", "5467892635", "BB234J798234");
		Customer dan = new Customer("Dan Beven", "dan@gmail.com", "6467234567", "CA2343434");
		Customer bob = new Customer("Bob William", "bob@gmail.com", "7861230987", "AD234234");
		
		//Antony Books 2 SUVs successfully But Not a third one
		boolean result = false;
		try {
			result = reservation.reserveCar(antony, CarType.SUV, "09-12-2018 11:48:48", "09-12-2018 22:48:48");
			System.out.println("Booking For " + antony.getFullName() + CarType.SUV + " Reservation : " + result);
			result = reservation.reserveCar(antony, CarType.SUV, "09-13-2018 11:48:48", "09-13-2018 22:48:48");
			System.out.println("Booking For " + antony.getFullName() + CarType.SUV + " Reservation : " + result);
			//When he tries to book third one got error
			result = reservation.reserveCar(antony, CarType.SUV, "09-14-2018 11:48:48", "09-14-2018 22:48:48");
			System.out.println("Booking For " + antony.getFullName() + CarType.SUV + " Reservation : " + result);
		} catch (ReservationException ex) {
			System.out.println(ex);
		}
		
		//Dan books 2 vans And start date after end date
		try {
			result = reservation.reserveCar(dan, CarType.VAN, "09-12-2018 11:48:48", "09-12-2018 22:48:48");
			System.out.println("Booking For " + dan.getFullName() + CarType.VAN + " Reservation : " + result);
			//when he reserves with start date after end date
			result = reservation.reserveCar(dan, CarType.VAN, "09-14-2018 11:48:48", "09-13-2018 22:48:48");
			System.out.println("Booking For " + dan.getFullName() + CarType.VAN + " Reservation : " + result);
		} catch (ReservationException ex) {
			System.out.println(ex);
		}

		//Bob books 2 Sedans : incorrect date format 
		try {
			result = reservation.reserveCar(bob, CarType.SEDAN, "09-12-2018 11:48:48", "09-12-2018 22:48:48");
			System.out.println("Booking For " + bob.getFullName() + CarType.SEDAN + " Reservation : " + result);
			//when he reserves with incorrect date format
			result = reservation.reserveCar(bob, CarType.SEDAN, "09-13-2018 11:48", "09-14-2018 22:48");
			System.out.println("Booking For " + bob.getFullName() + CarType.SEDAN + " Reservation : " + result);
			
		} catch (ReservationException ex) {
			System.out.println(ex);
		}
		
		//Bob books Invalid car type
		try {
			//when he reserves with incorrect car type
			result = reservation.reserveCar(bob, null, "09-13-2018 11:48:48", "09-14-2018 22:48:48");
			System.out.println("Booking For " + bob.getFullName() + CarType.SEDAN + " Reservation : " + result);
			
		} catch (ReservationException ex) {
			System.out.println(ex);
		}
		
		//Still Bob should be able to book 2 More cars as the last two has failed
		try {
			result = reservation.reserveCar(bob, CarType.SEDAN, "09-13-2018 11:48:48", "09-14-2018 22:48:48");
			System.out.println("Booking For " + bob.getFullName() + CarType.SEDAN + " Reservation : " + result);
			result = reservation.reserveCar(bob, CarType.SEDAN, "09-15-2018 11:48:48", "09-16-2018 22:48:48");
			System.out.println("Booking For " + bob.getFullName() + CarType.SEDAN + " Reservation : " + result);
			
		} catch (ReservationException ex) {
			System.out.println(ex);
		}
	}

}
