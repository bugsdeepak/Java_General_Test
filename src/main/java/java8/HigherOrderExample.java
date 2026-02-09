package main.java.java8;

import java.util.function.*;


/**
 * Higher-Order Functions (Java 8+)
 * Higher-order functions can:
 *
 * ✅ Accept functions as parameters
 * ✅ Return functions
 * ✅ Be assigned to variables
 *
 * First-order functions = Traditional methods (what Java had before Java 8)
 * Higher-order functions = Functions that can be passed around and manipulated (Java 8+)
 */
public class HigherOrderExample {

    // Higher-order function - accepts a function as parameter
    public static int applyOperation(int a, int b, BinaryOperator<Integer> operation) {
        return operation.apply(a, b);
    }

    // Higher-order function - returns a function
    public static Function<Integer, Integer> createMultiplier(int factor) {
        return (num) -> num * factor;
    }

    public static void main(String[] args) {
        // Pass function as argument
        int sum = applyOperation(5, 3, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // Output: 8

        int product = applyOperation(5, 3, (a, b) -> a * b);
        System.out.println("Product: " + product); // Output: 15

        // Store function in variable
        Function<Integer, Integer> doubler = createMultiplier(2);
        System.out.println("Double of 5: " + doubler.apply(5)); // Output: 10

        // Chain functions
        Function<Integer, Integer> tripler = createMultiplier(3);
        Function<Integer, Integer> addTen = num -> num + 10;

        int result = tripler.andThen(addTen).apply(5);
        System.out.println("Result: " + result); // Output: 25 (5*3=15, 15+10=25)
    }
}
