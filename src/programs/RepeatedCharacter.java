package programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * input : abcdefaaccdd
 * output: acd
 *
 *
 * lambda functions can only capture variables that are effectively final (like String or final variables)
 * This restriction is in place to prevent concurrency issues and ensure that lambda functions behave predictably.
 */
public class RepeatedCharacter {

    public static char[] getRepeatedCharacters(String str) {

        char[] charArr = str.toCharArray();
        //Linked Hash Map to maintain ordering of elements, when converting the key set to List and get index
        Map<Character, Integer> charCount = new HashMap<>(); // ==> initialize all values to 0
        Stream<Character> characterStream = IntStream.range(0, charArr.length).mapToObj(i -> charArr[i]);

        //Since forEach is a terminal operation we need to take the results and filter whose value is greater than one
        characterStream.forEach(a -> {
                    charCount.put(a, (charCount.get(a) != null ? charCount.get(a) : 0) + 1);
                });

        //Stream API does not iterate on collections; it rather creates a stream from the source, and you cannot source
        // one stream from two different resources.
        int keySize = charCount.keySet().size();
        List<Character> charList = charCount.keySet().stream().toList();

        //Stream<Character> chars =
        IntStream.range(0, keySize).filter(i -> charCount.get(charList.get(i)) > 1).forEach( i -> System.out.println(charList.get(i)));

        //.filter( charCount.get(a) > 1 add it to the Array

       return null;
    }

    public static void main(String[] args) {
        String str = "abcdefaaccdd";
        getRepeatedCharacters(str);

    }
}
