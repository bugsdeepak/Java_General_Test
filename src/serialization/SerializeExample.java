package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    
    public static String fileName = "carObject.out";
    
    public static void main(String[] args) {
        
        //create an object of car and serialize it
        Car car = new Car(12, 78);
        
        FileOutputStream fos = null;
        
        try {
            
            fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //if you try to serialize an object which does not implement
            //Serializable interface - causes NoSerializableException
            oos.writeObject(car);
            oos.flush();
            System.out.println("Car object is written to " + fileName);
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
