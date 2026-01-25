package main.java.inheritance.accessspecifier;

class BaseClass {
    
    //there is not point declaring the memeber as private and
    //the class as default package. Because the class will be 
    //avilable outside (for subclassing) only if the class is public.    
    protected int baseInt = 234;
    

}
