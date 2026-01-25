package main.java.interfaceEx;

public class FindImplementation implements InterfaceA {
    
    public static void main(String[] args) {
        
        FindImplementation obj = new FindImplementation();
        
        if(obj instanceof InterfaceA) {
            System.out.println("This objects class implemented interfaceA");
        }
        if(obj instanceof FindImplementation) {
            System.out.println("This object is of type FindImplementation");
        }
        
    }

}
