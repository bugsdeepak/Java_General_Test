package main.java.java8.functional;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Takes Integer, returns String
        Function<Integer, String> converter = num -> "Number: " + num;

        System.out.println(converter.apply(42)); // Output: Number: 42

        // Chaining functions
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        Function<Integer, Integer> combined = multiplyBy2.andThen(add10);
        System.out.println(combined.apply(5)); // Output: 20 (5*2=10, 10+10=20)
    }
}
