package main.java.java8.functional;

import java.util.function.Predicate;
import java.util.*;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate to check if number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Filter using predicate
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println); // Output: 2, 4, 6, 8, 10

        // Combining predicates
        Predicate<Integer> greaterThan5 = num -> num > 5;
        Predicate<Integer> evenAndGreaterThan5 = isEven.and(greaterThan5);

        numbers.stream()
                .filter(evenAndGreaterThan5)
                .forEach(System.out::println); // Output: 6, 8, 10
    }
}
