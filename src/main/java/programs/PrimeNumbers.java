package main.java.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbers {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter number:");
        int num = Integer.parseInt(bf.readLine());
        System.out.println("Prime number: ");
        int n;
        for(int i=1; i<num; i++){
            int j;
            for(j=2; j<i; j++){
                n = i%j;
                if(n==0){
                    break;
                }
            }
            if(i == j){
                System.out.print("  "+i);
            }
        }
    }
}
