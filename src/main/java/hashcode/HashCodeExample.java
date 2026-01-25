package main.java.hashcode;

public class HashCodeExample {
    
    //it is possible to define a method with out an access specifier.
    //in that case the method will be avilabe only inside that package.
    int amethod() {
        return 0;
    }

    public static void main(String[] args) {
        
        //As much as is reasonably practical, the hashCode method defined by 
        //class Object does return distinct integers for distinct objects
        HashCodeExample obj1 = new HashCodeExample();
        System.out.println("The hash code of the same object : " + obj1.hashCode());
        //no matter how many times you invoke in the same application
        //it will return the same integer.
        System.out.println("Again the hash code : " + obj1.hashCode());
        System.out.println("Again the hash code : " + obj1.hashCode());
        //if you create a new object. then new hash code
        obj1 = new HashCodeExample();
        System.out.println("New hash code : " + obj1.hashCode());
        //the hash code is supported for the benefit of hash tables.
        //actually hash code is the address of the object converted to an integer.
        
        HashCodeExample obj = new HashCodeExample();
        obj.amethod();
    }
}
