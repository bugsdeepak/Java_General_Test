package main.java.features_1_5.staticimports;

import static main.java.features_1_5.generics.MyClass.UserName;
import static main.java.features_1_5.generics.MyClass.getRandom;

public class StaticImportMembers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        double rand = getRandom();
        System.out.println(" User name : " + UserName);
        System.out.println(" Random number : " + rand);
    }
}
