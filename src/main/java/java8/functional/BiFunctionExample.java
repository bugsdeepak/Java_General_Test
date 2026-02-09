package main.java.java8.functional;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // Takes two arguments, returns one result
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        System.out.println(add.apply(5, 3));      // Output: 8
        System.out.println(multiply.apply(5, 3)); // Output: 15

        // String operations
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;
        System.out.println(concat.apply("Hello", "World")); // Output: Hello World
    }
}
