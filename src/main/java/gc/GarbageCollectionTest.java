package main.java.gc;

import java.util.HashSet;

public class GarbageCollectionTest {
    
    
    public static HashSet set = new HashSet();
        
    //add Objects to the hash set.
    //since the variable "set" is static all the objects it is 
    //holding will not be garbage collected, since the static variable
    //is loaded by class loader and will be removed when the JUM completes.
    
    
    /* you only get one "instance" of a class. Hence, the HashSet will live until you do
       GarbageCollectionTest.set = null;
     after which it (at some point) will be garbage collected 
    the contents of the hashset don't get GC'ed unless the reference is null'ed */

}
