package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeExample {
    
    public static void main(String[] args) {
        
        Car car = null;
        
        FileInputStream fis = null;
        
        try {
            
            fis = new FileInputStream("carObject.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            car = (Car)ois.readObject();
            
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("The contens of Car Object ");
        System.out.println("Colour : " + car.getColour());
        System.out.println("Car No : " + car.getCarNo());
        System.out.println("Engine Chasis No :" + car.getEngine().getChasisNo());
        System.out.println("Engine Model :" + car.getEngine().getModel());
        //if you try to retieve static and tranient fields you will get
        //detault values (initialzed) but no exception.
        System.out.println(car.getKmsRun());
    }
}
