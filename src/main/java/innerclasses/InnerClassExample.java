package main.java.innerclasses;

import java.util.Comparator;

public class InnerClassExample {
    
    //an inner class can be static but not an outer class
    
    private static class InnerClass implements Comparator {
        
        public int compare(Object ob1, Object ob2) {
            return 0;
            
        }
    }
}
