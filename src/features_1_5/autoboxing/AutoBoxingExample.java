package features_1_5.autoboxing;

import java.util.ArrayList;

public class AutoBoxingExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //create an integer list.
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        //add numbers.
        intList.add(23);
        intList.add(27);
        
        //if you try to autounbox null, get null pointer exception. 
        //uncomment the following line to exception
        //intList.add(null);
        
        //sum up the numbers in the list.
        int total = 0;
        for(int i=0; i<intList.size(); i++){
            total = total + intList.get(i);
        }
        
        System.out.println(" Total of all integers = " + total);
        
        intList.add(null);
        //check the of == operator - value comparison
        if(23 == intList.get(0)) {
            System.out.println(" int (Primitive) and Integer object are almost treated equally");
            
        }
        
        //reference identity comparison
        if(null == intList.get(2)){
          System.out.println(" Autoboxing unboxing is true");  
        }
    }
}
