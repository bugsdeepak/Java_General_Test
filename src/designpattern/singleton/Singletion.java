package designpattern.singleton;

/* the class which creates the Singletion object should be final, so that
 no body can extend it and declare their own objects.
 NO: the class need not be final. Reason: when you try to extend this class
 since the constructor is private you'll get compiler error like 
 "Implicit super constructor MySingletion() is not visible. 
       Must explicitly invoke another constructor"  */

public class Singletion {
    
    //the singleton object ref should be private, static (single instance) and final
    private static final Singletion singleton = new Singletion();
    
    //the constructor of the class which creates the singleton object
    //should be private, so that no one can create an object and cannot extend this class.
    private Singletion() {
        
    }

    /* the method which returns the singleton object should be public and static
    since the ref is static and only way to get the singleton object.
    
    In order to prevent the simultaneous invocation of the getter method by 2 threads or classes 
    simultaneously we add the synchronized keyword to the method declaration 
    
    No. There is no need for synchronization. Since the only operation we are doing
    here is just retrung the reference, we are not creating any instance here.
    
    */

    public static /* synchronized */ Singletion getSingleton() {
        return singleton;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Singleton Object created");
        
        System.out.println("Hash code First time calling: " + Singletion.getSingleton().hashCode());
        System.out.println("Hash code Second time calling: " + Singletion.getSingleton().hashCode());
        System.out.println("Hash code Third time calling: " + Singletion.getSingleton().hashCode());
        
    }
}
