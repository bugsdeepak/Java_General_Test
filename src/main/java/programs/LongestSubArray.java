package main.java.programs;

import java.util.ArrayList;
import java.util.List;

/**
 * Get the longest repeating continuous sub strings in the given string
 * and return their index and how many times the characters are repeated.
 * @author abened
 *
 */
public class LongestSubArray {
	
	public static int[] getLongestSubArray(String str) {
		
		if(null == str || 0 == str.length() || 1 == str.length()) {
			return new int []{0, 0};
		}
		
		char [] charArr = str.toCharArray();
		List<String> subArray = new ArrayList<String>();
		
		StringBuffer subArr = new StringBuffer();
		//does new string buffer required
		boolean isNewSBReq = true;
		//the character is continuous or broken
		boolean continuous = false, broken = false;
		
		for(int i=0, j=i+1; i<charArr.length-1; i++, j++){
			
			if(charArr[i] == charArr[j]) {
				if(isNewSBReq) {
					subArr = new StringBuffer().append(charArr[i]).append(charArr[j]);
					continuous = true;
					isNewSBReq = false;
				} else if (continuous) {
					subArr.append(charArr[j]);
				}
			} else {
				//the character is going continuously and broken now
				if(continuous) {
					broken = true;
					isNewSBReq = true;
				}
			}
			//If the character is broken add the sub-string to the sub Array list OR if it's continuous and we reached the end of the string.
			if(broken || (continuous && j == charArr.length-1)) {
				subArray.add(subArr.toString());
				broken = false;
			}
		}
		System.out.println(" Sub Arrays In the String : " + subArray);
		return null;
	}

	public static void main(String[] args) {
		getLongestSubArray("abcccddeeffgg");
		getLongestSubArray("000111222333333");
		
	}

}
