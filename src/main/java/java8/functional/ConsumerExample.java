package main.java.java8.functional;

import java.util.function.Consumer;
import java.util.*;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Consumer that prints in uppercase
        Consumer<String> printUpper = name -> System.out.println(name.toUpperCase());

        names.forEach(printUpper);
        // Output: ALICE, BOB, CHARLIE

        // Chaining consumers
        Consumer<String> printLower = name -> System.out.println(name.toLowerCase());
        Consumer<String> combined = printUpper.andThen(printLower);

        combined.accept("Test");
        // Output: TEST
        //         test
    }
}
