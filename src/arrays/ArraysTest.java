package arrays;

import java.util.Arrays;

/**
 * In Java, arrays are objects, are dynamically created, and may be assigned to variables of type Object.
 *  All methods of class Object may be invoked on an array.
 * @author abened
 *
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		int [] intArray1 = new int [2];
		int [] intArray2 = { 4, 5 };
		int [] intArray3 = { 2, 7, 3, 0, 9 };
		
		intArray1[0] = 4;
		intArray1[1] = 5;
		
		
		if(intArray1 instanceof Object) {
			System.out.println("Arrays are Objects");
		}
		
		if(intArray1.equals(intArray2)){
			System.out.println("Equal");
		} else {
			System.out.println("Merely calling the equals on arrays will not have correct result");
		}
		
		if(Arrays.equals(intArray1, intArray2)) {
			System.out.println("Use the Arrays class to compare two arrays");
		}
		
		System.out.println("If two array are equals, then there hash codes should be equal");
		System.out.println("Hascode of Array1 = " + Arrays.hashCode(intArray1) + " Hashcode of Array2 = " + Arrays.hashCode(intArray2));
		
		Arrays.sort(intArray3);
		System.out.println("We can Sort Arrays Using Arrays.sort() Method = Elements are");
		
		for(int i=0; i<intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}
	}
}
