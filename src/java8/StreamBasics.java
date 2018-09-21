package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasics {

	// LAMBDA Expressions are represented as Functional Interface in Java [Functions as Data] [We can pass behavior as an argument - behavior as data]
	// LAMBDA Expressions are brought for using the internal Iterations and Make use of Multi core technologies
	// Functional interface has only one abstract method (Runnable is an ideal old example)
	
	/* Method Reference: Static method references, Object method references
	 * A Functional Interface can be used for a parameter when a Lambda expression or Method reference passed 
	 * as an argument 
	 * 
	 * Types of Functional Interface 
	 * 1. Predicate - Predicate<T> { boolean test (T t) } - removeIf() is a Predicate
	 * 2. Function -  Function<T, R> { R apply(T t) } - sort(Comparator comp) 
	 * 3. Bi-Function - BiFunction<T, U, R> { R apply (T t, U u) } - Map.replaceAll(K, V)
	 * 4. Supplier - Supplier<T> { T get() } - Use Optional - NULL OBJECT PATTERN 
	 * 5. Consumer - Consumer<T> { void accept(T t) }  - forEach() is a Consumer */
	
	//Streams bring functional programming to Java
	
	//Advantages: heavy use of lambda expressions
	//            parallel streams for multi threaded / core operations
	
	//A STREAM IS A PIPE LINE CONSISTS OF A SOURCE FOLLOWED BY 0 OR MORE INTERMEDIATE OPERATIONS
	//AND ONE TERMINAL OPERATION (Streams uses Internal Iteration. Stream does not store any data, just acts as a wrapper)
	
    /** STREAM SOURCE: Collections, Lists, Sets, Arrays, Integers, Longs, Lines of a file
	STREAM OPERATIONS: INTERMIDIATE -> Filter, Map, Sort return another stream so we can
	chain multiple intermediate operations. TERMINAL -> ForEach, Collect, Reduce which is either
	void or return a non-stream result */
	
	/**  Intermediate (Aggregate) Operations : 
	* Order Matters For Large Data Sets: Filter first then sort or map
	* For very large data sets use Parallel Streams to enable multiple threads
	* anyMatch(), distinct(), filter(), findFirst(), flatmap(), map() == transform Data, skip(), sorted() 
	* ALL the Intermediate operations result another stream */
	
	//Intermediate operations return a new stream. They are always lazy; executing an intermediate operation such as filter() does not actually perform any filtering, 
	//but instead creates a new stream that, when traversed, contains the elements of the initial stream that match the given predicate. 
	//Traversal of the pipeline source does not begin until the terminal operation of the pipeline is executed. 
	
	/**  Terminal Operations :
	 * forEach() applies the same function to each element.
	 * collect saves the elements into a collection.
	 * other options reduce the stream to single summary element
	 * count(), min(), max(), reduce(), summaryStatistics()-> only for Integers
	 * 
	 * Terminal Operations Can be classified to 1. Aggregate 2. Iteration  3. Searching
	 * 1. Aggregate - toArray() reduce() collect() sum() min() max() count().
	 *    anyMatch() allMatch() -> short circuiting 
	 *    
	 * 2. Iteration - forEach() -> Not Order Preserving
	 * 
	 * 3. Searching - findFirst() -> Short circuiting
	 *                findAny() -> Short circuiting, non deterministic
	 *                
	 */
	
	//Terminal operations, such as Stream.forEach or IntStream.sum, may traverse the stream to produce a result or a side-effect. After the terminal operation is performed, 
	//the stream pipeline is considered consumed, and can no longer be used; if you need to traverse the same data source again, 
	//you must return to the data source to get a new stream. In almost all cases, terminal operations are eager, completing their traversal of the data source and processing of the pipeline before returning.
	
	
	/** Collectors : Journey's End of a Stream (Stream is lazy - that is the intermediate operations are executed only when the terminal Operation is met */
	/* The Life of a Stream Element 
	   1. Born At Splitarator (Works as Splitter on Parallelism and Iterator on Serial Access
	   2. Transformed By (Intermediate Operations)
	   3. Collected (By a Terminal Operation)
	   
	   forEach() method in any order of the data in Stream. []
	   forEachOrdered() method in the given order of the data in Stream.
	   */
	
	/* DONT DO ANY MODIFICATION ON THE SOURCE WHILE THE STREAMS USING THEM. 
	 * ARGUMENTS (LAMBDA) SHOULD BE STATE LESS. 
	 * BANISH SIDE EFFECTS COMPLETELY (EXCEPT forEach() and peek() ) 
	 * ASSOCIATIVITY IS THE KEY TO PARALLELISM */
	
	public static void main(String[] args) {
		
		//Integer Stream
		IntStream.range(1, 10)
		.skip(3)
		.map(x -> f(x))
		.forEach(System.out::println);
		
		//String Stream
		String [] names = { "Amalan", "Amudhan", "Amaran", "Vimalan" , "Rajesh", "SivaGuru"};
		Arrays.stream(names)   // Same as Stream.of(names)
		.filter(x -> x.startsWith("Am"))
		.sorted()    //.findFirst().ifPresent(System.out::println);
		.forEach(System.out::println);
		
		//File stream
		try {
			Stream<String> companies = Files.lines(Paths.get("src/java8/companies.txt")); 
			companies.sorted().forEach(System.out::println);
			companies.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//REDUCE VS COLLECT
		//REDUCE - Take all elements from Input and produce single result (Sum of integers/Count of elements)
		//COLLECT - Mutable reduction.
	}
 
	private static int f(int x) {
		return x + 2;
	}
}
