package abstractex;

public class SubClass extends SuperClass {
    
    public static int i;

    public static void main(String[] args) {
        
        //when you create an object of the sub class
        //the super class object is "implicitly" created and
        //avilable in the sub class, though it is an abstract class. 
        new SubClass();
        
        //only base class methods can be overridden
        //not base class variables.
        System.out.println("I of subclass : " + i);
        System.out.println("I of superclass : " + SuperClass.i);
        
        //even primitive values are of type java.lang.Class
        System.out.println(int.class.getSimpleName());
    }
}
