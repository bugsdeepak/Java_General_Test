package main.java.programs.strings;

public class FindFirstNonRepeatedCharInString {

    private static void findFirstNonRepeatedCharInString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }
        System.out.println("All characters are repeated.");
    }

    private static void findFirstRepeatedCharInString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println("First repeated character: " + ch);
                return;
            }
        }
        System.out.println("No characters are repeated.");
    }
    public static void main(String[] args) {
        String str = "swiss";
        findFirstNonRepeatedCharInString(str);
        findFirstRepeatedCharInString(str);
    }

}
