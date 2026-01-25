package main.java.programs;

import java.util.ArrayList;

public class FirstNonRepeatingCharOfString {
	
	class CharCount {
		
		private char theChar;
		private int charCount = 0;
		
		public char getTheChar() {
			return theChar;
		}
		public void setTheChar(char theChar) {
			this.theChar = theChar;
		}
		public int getCharCount() {
			return charCount;
		}
		public void incrementCharCount() {
			charCount++;
		}
		
		
	}
	
	public static char findFirstNonRepeatingChar(String str) {
		char nonrepeatedChar = 'a';
		char charArr [] = str.toCharArray();
		
		//Associate List where, the count of 1st char in 'charList' is stored in 1st index of 'countList'
		ArrayList<Character> charList = new ArrayList<Character>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		
		char newChar; int newCharIndx; Integer newCharCount;
		for(int i=0; i<charArr.length; i++) {
			newChar = new Character(charArr[i]);
			if(charList.contains(newChar)) {
				newCharIndx = charList.indexOf(newChar);
				newCharCount = new Integer(countList.get(newCharIndx).intValue() + 1);
				countList.remove(newCharIndx);
				countList.add(newCharIndx, newCharCount);
			} else {
				charList.add(newChar);
				countList.add(charList.indexOf(newChar), new Integer(1));
			}
		}
		
		for(int i=0; i<countList.size(); i++) {
			if(countList.get(i).intValue() == 1 ) {
				nonrepeatedChar = charList.get(i);
				//found the first non repeating character - hence break for loop
				break;
			}
		}
		
		return nonrepeatedChar;
	}

	public static void main(String[] args) {
		
		String str = "annaefaehfhd";
		System.out.println(" First Non Repeating Character in : " + str + " IS = " + findFirstNonRepeatingChar(str) );

	}

}
