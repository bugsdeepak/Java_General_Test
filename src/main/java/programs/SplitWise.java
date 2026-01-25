package main.java.programs;

import java.util.Scanner;

public class SplitWise {

	static int split(int n, int k, int [] ar, int b) {		
		int sum = 0;
		for (int i=0; i<ar.length; i++) {
			if (k!=i) {
				sum += ar[i];
			}
		}
		int eachPersonShare = sum  / 2;		
		if (b == eachPersonShare)
			return 0;
		else
			return b - eachPersonShare;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = split(n, k, ar, b);
        if (result == 0) {
        	System.out.println("Bon Appetit");
        } else {
        	System.out.println(result);
        }
        
    }
}
