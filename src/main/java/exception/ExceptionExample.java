package main.java.exception;

import java.io.FileInputStream;

public class ExceptionExample {
    
    public static void main(String[] args) {
        
        try{
            
            //the following code throws checked main.java.exception
            FileInputStream fis = new FileInputStream("asdf");
            
            //the following code throws Runtime Exception (unchecked main.java.exception)
            int b = 3/0;
            
            
        //the clss Exception will catch both checked main.java.exception and
        //unchecked main.java.exception (i.e compile time and runt time)
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
