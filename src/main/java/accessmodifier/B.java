package main.java.accessmodifier;

import java.util.ArrayList;
import java.util.List;

public class B<T> extends A {
    
    //we can not make the following inherited method as private
    //because we can not reduce the visibility of the inherited method.
    protected void protMethod() {
        
        List<ProtectedTest> as = new ArrayList<ProtectedTest>();
        
        as.add(new ProtectedTest());
        
        System.out.println("Protected method of class B extends A");
    }
    
    public void antotherM() {
        
        B obj = new B<ProtectedTest>();
        protMethod();
        
    }
    
    public static void main(String[] args) {
        
        new B().antotherM();
    }
    
}
