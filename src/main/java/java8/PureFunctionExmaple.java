package main.java.java8;

/**
 * A pure function is a function that:
 *
 * ✅ Always returns the same output for the same input (Deterministic)
 * ✅ Has no side effects (doesn't modify external state)
 * ✅ Doesn't depend on external state (only uses its parameters)
 */
public class PureFunctionExmaple {

    // ✅ PURE: Always returns same result
    public static int multiply(int x, int y) {
        return x * y;
    }

    // ✅ PURE: String operations are deterministic
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // ❌ IMPURE: Uses random - different output each time
    public static int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }

    // ❌ IMPURE: Uses current time - different output each time
    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        // Pure functions are predictable
        System.out.println(multiply(3, 4));        // Always 12
        System.out.println(toUpperCase("hello"));  // Always HELLO

        // Impure functions are unpredictable
        System.out.println(getRandomNumber(100));  // Different each time
        System.out.println(getCurrentTime());      // Different each time
    }
}