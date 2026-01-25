package main.java.features_1_5.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastProblem {

    /**
     * @param args
     */
    @SuppressWarnings({"unchecked","unused"})
    public static void main(String[] args) {
        
        List intList = new ArrayList<Integer>();
         
        intList.add("antony");
        intList.add("deepak");
        
        Integer i = (Integer)intList.get(0);

    }

}
