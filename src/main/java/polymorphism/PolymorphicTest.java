package main.java.polymorphism;

abstract class Vehicle {
    public void drive() {
    }
}

class Car extends Vehicle {
    public void drive () {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    public void drive () {
        System.out.println("Driving a bike");
    }
}

public class PolymorphicTest {
    
    private static void driveTest(Vehicle v) {
        v.drive();
    }
    
    public static void main(String[] args) {
        
        //get the input from user
        int vehicleToDrive = 2;
        Vehicle v;
        
        //the drive method of which vehicle is called is decided at the 
        //run time, which is called late/dynamic binding - an example
        //for runtime main.java.polymorphism.
        if( 1== vehicleToDrive) {
            v = new Car();
            driveTest(v);
        } else if ( 2== vehicleToDrive) {
            v = new Bike();
            driveTest(v);
        }
    }
}
