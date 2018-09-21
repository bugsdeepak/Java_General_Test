package features_1_5.varargs;

public class VarArgsExample {

    public static void printArgs(String... args) {
        for(String arg: args) {
            System.out.println("Arg = " + arg);
        }
    }
   
    public static void main(String... args) {        
        String names[] = { "antony", "deepak", "sundar" };
        printArgs("arg0", "arg1", "arg3");        
        printArgs();        
        printArgs(names); 
        System.out.printf("int value = %d; float value = %2.2f%n", 43, 22.2); 
    }

}
