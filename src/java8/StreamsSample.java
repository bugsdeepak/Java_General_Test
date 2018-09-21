package java8;

import java.util.ArrayList;
import java.util.Random;

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
		
		//Streams are faster using all the cores in a multiple - core feature
		result = data.parallelStream().map(i -> f(i)).reduce(Integer::sum).get();
		
		System.out.println("Result = " + result);

		
	}

}
