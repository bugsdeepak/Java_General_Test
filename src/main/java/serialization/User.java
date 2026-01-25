package main.java.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Suppose we have a class User that maintains the user's password in an 
   instance variable (as well as other information about a user), and 
   we do not want to store the password or send it over a main.java.network without
   encoding it. The following example demonstrates how to customize 
   the main.java.serialization mechanism to achieve this: */

public class User implements Serializable {
    
    private static final long serialVersionUID  = 1234234324l;
    
    protected String name;      
    protected transient String password;
    
    // ... other serializable instance variables ...      
    
    private void readObject(ObjectInputStream inStr) 
    throws IOException, ClassNotFoundException {  
        
        inStr.defaultReadObject();         
        password = decode((String) inStr.readObject());     
    }    
    
    private void writeObject(ObjectOutputStream outStr) throws IOException {
        
         outStr.defaultWriteObject();         
         outStr.writeObject(encode(password));
   }     
    
    // ... other methods (including encode and decode) ...   }
    
    private static String encode(String str) {
        //encoding main.java.process
        return str;
    }
    
    private static String decode(String str) {
        //decoding main.java.process
        return str;
    }
}

//The variable password is marked transient so that the default mechanism 
//does not serialize its value.  The class defines readObject to call 
//defaultReadObject to serialize the values for all other instance variables 
//and handle the object's class identity, and to use its private decode method 
//when deserializing the value for the password variable. The writeObject method 
//performs the corresponding operations in the same order.  Note that the methods 
//for readObject and writeObject do not handle the exceptions that can occur, 
//but propagate them to the caller