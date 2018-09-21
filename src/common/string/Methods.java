package common.string;

public class Methods {
   
    
    /* Access modifiers and access specificiers specify an attribute
     * of a mehod not the method itself. A method is defined/constructed/
     * made ONLY by the method name and its arguments (Not even the
     * return type). Even though, the modifiers are different for the 
     * following methods they are same. 
     */
    
/*    public static int getMarks() {
        return 0;
    }
    
    private void getMarks() {
        
    }
    
    static int getMarks() {
        return 1;
    }
    
    public final int getMarks() {
        
    }*/
    
    public static void main(String[] args) {
        
        int i = 10;
        //Even though the "+" operator is overloaded to combine strings.
        //if the data type are similar the "+" operation is performed correctly. 
        System.out.println(i + 5 + "1");
        
        double d = 23.345;
        //the following statement gives compiler error - type mismatch
        //float f = 234.4;
        //when ever you declare a float literal with decimal point add "f"
        float f1 = 24.5f;
        
        System.out.println(d + f1);
        //since the string literal comes first the value of d appended to it
        //and printed then the value of f1 printed.
        System.out.println("23" + d + f1);
        //But here the value of "d+f1" printed then "99" printed.
        System.out.println(d + f1 + "99");
    }
}
