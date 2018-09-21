package features_1_5.varargs;

public class VarArgs1 {

    public static void printArgs(String... names) {
        for(String name: names) {
            System.out.println("Arg = " + name);
        }
    }
    
    //the variable argument should be the last parameter.
    //so the following method produces compiler error.
    //public static void varargs(int... values, String pattern) {
           //no definition  
    //}
    
    public static void variableArgs(String pattern, String... strings) {
        
        System.out.println(" The pattern = " + pattern);
        for(String str:strings) {
            System.out.println(" The str = " + str);
        }
    }
    
    /**
     * Even main method syntax can be changed to take vararg parameter.
     * 
     * @param args
     */
    public static void main(String...args) {
        
        //the method (vararg) can be called without any argument
        printArgs();
    }
}
