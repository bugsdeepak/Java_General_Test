package common.string;

public class RemoveSpecialCharacters {

	
	private static final java.lang.String regexRemoveSpecChars = "[^\\w\\s]";
	private static final java.lang.String EMPTY_QUOTES = "";
	
	public static void main(java.lang.String[] args) {
		
		java.lang.String yourString = " Hello there how are you ! @ # $ % ^ & * ( ) { } ? > < , . / ` ~ = - ";
		
		//string.replaceAll("[regex]", replace);
		//java.util.regex.Pattern.compile(regex).matcher(string).replaceAll(replace)
		
		//A regex pattern replace which is not words like a-z, A-Z, 0-9 replace with empty 
		java.lang.String  result1 = yourString.replaceAll("[^\\w\\s]","");
		
		//A regex pattern. The ^ character must not be the first one in the list, since you'd then either have to escape it or it would mean "any but these characters".
		//The - character needs to be the first or last one on the list, otherwise you'd have to escape it or it would define a range 
		java.lang.String  result2 = yourString.replaceAll("[-!@#$%&*(){}?></`~=+.^:,]","");
		
		//A regex pattern where we escape all the characters, that have special meaning in regular expression: here we escaped all the special characters.
		java.lang.String  result3 = yourString.replaceAll("[\\-\\!\\@\\#\\$\\%\\&\\*\\(\\)\\{\\}\\?\\>\\<\\/\\`\\~\\=\\+\\.\\^\\:\\,]","");
		
		System.out.println("Output After removing special characters:" + result1);
		System.out.println("Output After removing special characters:" + result2);
		System.out.println("Output After removing special characters:" + result3);
		
		java.lang.String origninal = new  java.lang.String(" Hello there how are you ! @ # $ % ^ & * ( ) { } ? > < , . / ` ~ = - ");
		System.out.println("Output After removing Special Characters:" + removeAllSpecialChars(origninal));
		System.out.println("Input  After removing Special Characters:" + origninal);

	}
	
	public static java.lang.String removeAllSpecialChars(java.lang.String original) {
		return original.replaceAll(regexRemoveSpecChars, EMPTY_QUOTES);
	}

}
