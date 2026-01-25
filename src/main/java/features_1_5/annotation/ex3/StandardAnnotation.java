package main.java.features_1_5.annotation.ex3;

import java.util.ArrayList;
import java.util.List;

public class StandardAnnotation extends main.java.features_1_5.annotation.ex1.Foo {
    
    @Override
    public void m9() {
        //the method is overridden form of Foo
    }
    
    @Deprecated
    public static int getInt() {
       //method definition 
       return 0;
    }
    
    public static int getIntValue() {
        //method definition
        return 0;
    }

    @SuppressWarnings({"unchecked","unused"})
    public static void main(String[] args) {        
        List intList = new ArrayList();
        intList.add("antony");
        intList.add("deepak");
        Integer i = (Integer)intList.get(0);
    }
}
