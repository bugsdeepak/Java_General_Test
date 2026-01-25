package main.java.programs;

public class NullMatching { 
    
    public void print(String s) {
        System.out.println("recieved string");
    }
    
    public void print(Object i) {
        System.out.println("received Object");
    }
    
    public static Object aMethod(){
        
        //we can define (create) a class inside a method  AND
        //we can create an object of it and return.
        
        class Inner {
            
            public Inner() {
                System.out.println("Insider inner class MayBeInner");
            }
        };
        
        Inner inner = new Inner();
        
        return inner;
        
    }
    
    public static boolean isOdd(int i) {        
        return i%2 != 0;
    }
    
    
    
    public static void main(String[] args) {
        
        NullMatching nm = new NullMatching();
        nm.print(null);
        
        System.out.println(" 3 is Odd : " + isOdd(3));
        System.out.println(" 4 is Odd : " + isOdd(-9));
        
        aMethod();
        
    }
}
