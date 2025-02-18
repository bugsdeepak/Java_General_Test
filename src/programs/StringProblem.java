package programs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([])"
 * Output: true
 */

public class StringProblem {

    public static void main(String arags []) {

        String value = "{[]}}";
       System.out.println(validatestring(value));


    }

    public static boolean validatestring(String value) {
        List<Character> charList = new ArrayList<>();

        //validation any other charcters

        boolean validate = true;
        for(int i=0; i<value.length(); i++) {

            if(value.charAt(i) == '(' || value.charAt(i) == '{' || value.charAt(i) == '[') {
                charList.add(value.charAt(i));
            } else if (value.charAt(i) == ')') {
                if (charList.contains(')')) {
                    charList.remove(')');
                } else {
                    validate = false;
                }
            } else if (value.charAt(i) == '}') {
                if (charList.contains('}')) {
                    charList.remove('}');
                } else {
                    validate = false;
                }
            } else if (value.charAt(i) == ']') {
                if (charList.contains(']')) {
                    charList.remove(']');
                } else {
                    validate = false;
                }

            }


        }

        if(charList.isEmpty() && validate) {
            return true;
        } else {
            return false;
        }

    }
}


