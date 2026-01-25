package main.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * Debugging Java streams directly using traditional breakpoints can be challenging due to their lazy and functional nature.
 * however there are some alternate approaches
 *
 * 1. Using peek() for Intermediate Inspection
 * 2. Stream Debugger in IDEs - IntelliJ IDEA
 *
 * Streams are functional in nature, meaning that operations on a stream produce a new stream without modifying the source.
 * This allows for efficient and potentially parallel processing of data.
 *
 */
public class StreamsSample {

	public static int f(int n) {
		for (int i=1; i < 10000; i++) {
			n = n ^ i;
			if (n <= 10)
				n = 10;
		}
		return n;
	}
	public static void main(String[] args) {
		
		Random rand = new Random();
		ArrayList<Integer> data = new ArrayList<>();
		for (int i =0; i < 1000000; i++) {
			data.add(rand.nextInt());
		}
		System.out.println("Starting...........");

		// YOU COULD HAVE USED THREADS
		int result = 0;   //traditional for each approach
		//for (int i : data) {
		//	result += f(i);
		//}
		
		//Normal stream approach
		//result = data.stream().map(i -> f(i)).reduce(Integer::sum).get();
		
		//Streams are faster using all the cores in a multiple - main.java.core feature
		result = data.parallelStream().map(i -> f(i)).reduce(Integer::sum).get();
		
		System.out.println("Result = " + result);

		/**
		 * 	 * Types of Functional Interface
		 * 	 * 1. Predicate - Predicate<T> { boolean test (T t) } - removeIf(), filter() is a Predicate
		 * 	 * 2. Function -  Function<T, R> { R apply(T t) } - sort(Comparator comp)
		 * 	 * 3. Bi-Function - BiFunction<T, U, R> { R apply (T t, U u) } - Map.replaceAll(K, V)
		 * 	 * 4. Supplier - Supplier<T> { T get() } - Use Optional - NULL OBJECT PATTERN
		 * 	 * 5. Consumer - Consumer<T> { void accept(T t) }  - forEach() is a Consumer
		 */

		//1. Predicate
		List<Integer> integerList = List.of(12, 123, 23, 234, 20);
		//Returns true if the input argument matches the predicate, otherwise false
		Predicate<Integer> isOdd  =  x -> x % 2 == 1;

		List<Integer> oddList = integerList.stream().filter(isOdd).toList();
		System.out.println("Predicate Exmple: All Odd Number is the list = " + oddList.toString());

		//2. Function
		// A function that return the last name when two names separated by space
		Function<String, String> getLastName = (x) -> {
															String items [] = x.split(" ");
		                                                    return items[1];
															};
		final String fullName = "Antony Benedict";
		System.out.println("Antony Benedict's last name = " + getLastName.apply(fullName));
		Function<String, Integer> findLength = x -> x.length();
		//Chaining Functions
		System.out.println("Antony Benedict's Last Name Length = " + getLastName.andThen(findLength).apply(fullName));

		//3. Bi-Function
		//BiFunction<T, U, R>, where T is the type of the first argument, U is the type of the second argument, and R is the type of the result.

		// Example 1: Adding two integers
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		int sum = add.apply(5, 3); // sum will be 8
		System.out.println("Sum: " + sum);

		// Example 2: Concatenating two strings
		BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
		String resultStr = concat.apply("Hello, ", "World!"); // result will be "Hello, World!"
		System.out.println("Concatenation: " + resultStr);
	}

}
