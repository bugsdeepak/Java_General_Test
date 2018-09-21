package carproblem.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import carproblem.type.Car;
import carproblem.type.CarType;

public class CarStore {
	
	private static List<Car> sedanCars = new ArrayList<Car>();
	private static List<Car> suvCars = new ArrayList<Car>();
	private static List<Car> vanCars = new ArrayList<Car>();
	
	public static void addCar(CarType carType, Car c) {
		
		switch(carType) {
		case SUV:
			suvCars.add(c);
			break;
		case SEDAN:
			sedanCars.add(c);
			break;
		case VAN:
			vanCars.add(c);
			break;
		}
	}

	public static List<Car> getSedanCars() {
		return sedanCars;
	}

	public static List<Car> getSuvCars() {
		return suvCars;
	}

	public static List<Car> getVanCars() {
		return vanCars;
	}
	
	public static int getAvilableCarCount(CarType carType) {
		int count = 0;
		//Predicate<Car> predicate = s -> s.isAvilable() == true;
		switch(carType) {
		case SUV:
			count = (int)suvCars.stream().filter( s -> s.isAvilable() == true).count();
			break;
		case SEDAN:
			count = (int)sedanCars.stream().filter( s -> s.isAvilable() == true).count();
			break;
		case VAN:
			count = (int)vanCars.stream().filter( s -> s.isAvilable() == true).count();
			break;
		}
		return count;
	}
	
	public static Car getAvilableCar(CarType carType) {
		Optional<Car> c = null;
		Predicate<Car> predicate = s -> s.isAvilable() == true;
		switch(carType) {
		case SUV:
			c = suvCars.stream().filter(predicate).findFirst();
			break;
		case SEDAN:
			c = sedanCars.stream().filter(predicate).findFirst();
			break;
		case VAN:
			c = vanCars.stream().filter(predicate).findFirst();
			break;
		}
		return (c != null) ? c.get() : null;
	}
}
