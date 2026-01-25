package main.java.inheritance;

public class WhenInherit  { //extends Base1{
    
	//classes should not be subclassed unless the programmer intends on modifying 
	//or enhancing the fundamental behavior of the class
    public static void main(String[] args) {
        
        //you can not inherit a class when it is final
        //or when its constructor is private.
        
        //when we try to extend we get the following error
        //Implicit super constructor Base1() is not visible for default 
        //constructor. Must define an explicit constructor
    }

}

class Base1 {
    
    private Base1() {
        
    }
    
}
