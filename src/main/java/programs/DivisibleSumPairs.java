package main.java.programs;

import java.util.HashSet;
import java.util.Set;

/**
 * Count the number of pairs in an array having sums that are evenly divisible by a given number.
 * Hint: Integer Pair : Do not add the number to itself. ex: adding number at index 1 again with index 1.
 * Given an integer array and a0, a1,...an and Integer k. Find all the combination of pairs
 * in the array which is completely divisible by k
 *  The Integer array is not sorted and may contain duplicate elements.
 * @author antbened
 *
 */

public class DivisibleSumPairs {
	
	public static int getDivisibleSumOfIntsSLOW(int[] data, int k) {		
		int count = 0;
		//To Identity unique pairs
		Set<String> uniquePair = new HashSet<String>();
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data.length; j++) {
				
				//As we have to find only pairs, no need to compare values with same index
				if (j == i)
					continue;
				
				if ((data[i] + data[j]) % k == 0) {
					//check the integer pair is unique or not
					if (!uniquePair.contains(getConcatenatedValues(i,j))) {
						//store the integer pair and their reverse in the set
						uniquePair.add(getConcatenatedValues(i, j));
						uniquePair.add(getConcatenatedValues(j, i));
						count++;
					}
				}
			}
		}
		return count;		
	}
	
	private static String getConcatenatedValues(int i, int j) {		
		return new StringBuffer().append(i).append(j).toString();
	}

	public static int getDivisibleSumOfInts(int[] data, int k) {		
		int count = 0;
		for (int i=0; i<data.length; i++) {
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int [] data = { 1, 3, 2, 6, 1, 2 };
		int k = 3;
		System.out.println(" Divisible Count : " + getDivisibleSumOfIntsSLOW(data, k));

	}

}
