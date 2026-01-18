package programs.strings;

import java.util.HashMap;
import java.util.Map;

public class CharFreqCount {

    private static int getCharFreqCount(String str, Character ch) {
        Integer count;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                count = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), count);
            } else  {
                map.put(str.charAt(i), 1);
            }
        }
        return map.get(ch);
    }


    public static void main(String[] args) {
        System.out.println("CharFreqCount of E in DEEPAK ==> " + getCharFreqCount("DEEPAK", 'K'));
    }
}
