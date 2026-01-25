package main.java.exception;

import main.java.hashcode.collection.Employee;

public class RunTimeExceptionEx {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee(23, "Hello");
        
        //when you create an array of primitive(int) values, 
        //they are initialized to zeros
        int arr[] = new int[4];
        
        System.out.println("Value of array " + arr[3]);
        
        //but when you declare an primitive value it is not initialized.
        int a;
        
        //we can throw and catch error in our code
        if (false) {
            throw new OutOfMemoryError("No memory");
        }
        
        try {
            
            emp = null;
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            
        } catch (RuntimeException e) {
            //we can cath RunTImeException using try, catch block
            //like NullPointerException, ClassCastException.......
            //(All Unchecked Exceptions)
            e.printStackTrace();
            System.out.println("Exception : " + e);
            //the finally block will be exectued, even though there is
            //a return statement in the catch block.
            return;
            //we can not debug after the runtime main.java.exception is thrown.
            
          //only if the try block is throwing(expected) a checked main.java.exception
            //then only we can catch it, unlike unchecked exceptions.
        } /* catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } */
        
        finally {
            //the finally block is executed for runtime main.java.exception also.
            System.out.println("In the Finally block");
        }
        
        try {
            
            
        } catch (Error er) {
            er.printStackTrace();
        }
        
        //the following is legal
        try {
            
        } finally {
            
        }
        
        
    }
}
