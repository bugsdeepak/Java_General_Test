package features_1_5.varargs;

import java.util.ArrayList;
import java.util.List;

public class VarArgs {
    
    public static void printArgs(String... args) {
        for(String arg: args) {
            System.out.println("Arg = " + arg);
        }
    }
   
    public static void main(String[] args) {
        
        String names[] = { "antony", "deepak", "sundar" };
        
        List<String> animals = new ArrayList<String>();
        
        //the method can be called with n number of arguments - separated by comma
        printArgs("arg0", "arg1", "arg3");
        
        //without any arguemnt
        printArgs();
        
        //an array that contains the arguments.
        printArgs(names);
        
        //but an list of object can not be passed - following is error
        //printArgs(animals);
        
    }
}
