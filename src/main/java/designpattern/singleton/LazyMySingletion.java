package main.java.designpattern.singleton;

/* the class need not be final. Reason: when you try to extend this class
 since the constructor is private you'll get compiler error like 
 "Implicit super constructor MySingletion() is not visible. 
       Must explicitly invoke another constructor"  */

public class LazyMySingletion {
    
    //the singleton object ref should be private, static (single instance)
    private static LazyMySingletion singleton = null;
    
    //the constructor of the class which creates the singleton object
    //should be private, so that no one can create an object and cannot extend this class.
    private LazyMySingletion() {
        
    }

    /* the method which returns the singleton object should be public and static
    since the ref is static and only way to get the singleton object.
    
    This is called lazy initialization, that is we create the object only when this
    method is called.
    
    In order to prevent the simultaneous invocation of the getter method by 2 threads or classes 
    simultaneously we add the synchronized keyword to the method declaration 
    */

    public static synchronized LazyMySingletion getSingleton() {
    	
    	if(singleton == null) {
    		singleton = new LazyMySingletion();
    	}
        return singleton;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Singleton Object created");
        
        System.out.println("Hash code First time calling: " + LazyMySingletion.getSingleton().hashCode());
        System.out.println("Hash code Second time calling: " + LazyMySingletion.getSingleton().hashCode());
        System.out.println("Hash code Third time calling: " + LazyMySingletion.getSingleton().hashCode());
    }
}
