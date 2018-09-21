package programs.strings;

public class RemoveConsequentlyRepeatingCharacters {
	
	public static void main(String[] args) {
		
		String str = "aantooonyyyy";
		System.out.println(" Super Reduced String = " + getSuperReducedString(str));
		
	}
	
	public static String getSuperReducedString(String original) {
		while (getConsequentlyRepeatedCharIndex(original) >= 0) {
			int indxToRemmove = getConsequentlyRepeatedCharIndex(original);
			original = removeTwoCharsFromString(original, indxToRemmove);
		}
		return original;
	}
	
	public static String removeTwoCharsFromString(String original, int index) {
		char chars [] = original.toCharArray();
		char newChars [] = new char [chars.length-2];
		int newCharIndx = 0;
		for (int i=0; i<chars.length; i++) {
			if (i == index || i == index+1){
				continue;
			}
			newChars[newCharIndx] = chars[i];
			newCharIndx++;
		}
	    return String.copyValueOf(newChars);
	}
	
	public static int getConsequentlyRepeatedCharIndex(String str) {
		int index = -1;
		for (int i=0; i<str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				index = i;
				break;
			}
		}
		return index;
	}

}
