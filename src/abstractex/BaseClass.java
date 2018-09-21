package abstractex;

/**
 * We can define an abstract class without any abstract methods.
 * 
 * @author deepak
 *
 */
public abstract class BaseClass {
    
    public transient int i = 23;
    
    public void nonAbstractMethod() {
        
    }
    
    //abstract methods have no body
    public abstract void getNumber();
    
}
