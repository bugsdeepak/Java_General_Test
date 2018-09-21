package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {
    
    public static void main(String[] args) {
        
        try{
            
            //the following code throws checked exception
            FileInputStream fis = new FileInputStream("asdf");
            
            //the following code throws Runtime Exception (unchecked exception)
            int b = 3/0;
            
            
        //the clss Exception will catch both checked exception and
        //unchecked exception (i.e compile time and runt time)
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
