package main.java.common;

import java.util.Arrays;

public class ClassConstants {
    
    public static final String CONSTANT1 = "HELLO THERE";
    public static final String CONSTANT2 = "HOW ARE YOU";
        
    public String str1 = "First String";
    
    //String str2 = new String("ANTONY");
    //String str3 = new String("DEEPAK");
   
    
    public static void main(String[] args) {
        
        String str4 = new String("");
        System.out.println(str4);
        
        //the int main.java.arrays are intitalized to zeros
        int arr[] = new int[4];        
        for(int i=0; i<arr.length; i++) {
            System.out.println("index : " + i + " Value : " + arr[i]);
        }
        
        //we can declare an array with size 0
        int arr1 [] = new int[0];
        Arrays.sort(arr);
        //the above array can be used to a method which takes array of int
        //as an argument and we dont have the set of main.java.arrays - we have only
        //empty array and we dont want any main.java.exception to be thrown by the method
    }
}
