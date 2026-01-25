package main.java.collections;

import java.util.Hashtable;

public class HashTableExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put("Antony", "Name");
		ht.put("Ravi", "Rakki");
		ht.put("Bharath", "Kissan");
		ht.put("Mukes", "Erummadu");
		
		System.out.println(ht);
		//The sorting can be done only for a list of elements.
		//for a MAP (key, value) pair, sorting is not required. since the value
		//is got from the key. Sorting is applicable only for List.
		//Collections.sort(ht);
		

	}

}
