package programs.strings;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {

    public static void main(String[] args) {

        //1st method
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
        // Using HashSet - doesn't preserve order
        List<String> withoutDuplicates = new ArrayList<>(new HashSet<>(list));
        // Using LinkedHashSet - preserves insertion order
        List<String> noDuplicates = new ArrayList<>(new LinkedHashSet<>(list));

        //2nd Method - Using Streams
        list.stream().distinct().collect(Collectors.toList());



    }
}
