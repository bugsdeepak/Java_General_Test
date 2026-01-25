package main.java.programs;

public class Palnidrome {

    public static boolean isPalindrome(String str) {
        boolean isPalindrome = true;

        //traverse the string with two indices from beginning, from end, comparing elements
        for (int i = 0, j = str.length() - 1; i < (str.length() / 2); i++, j--) {
            if (!(str.charAt(i) == str.charAt(j))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println("Output of Palindrome = " + isPalindrome("MALAGYGALAM"));
    }
}
