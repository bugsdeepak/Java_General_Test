package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCollectionsTest {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//We can declare a collection of type string - Interface and actual implementing Object
		List<String> list1 = new ArrayList<String>();
		list1.add("antony");
		//Adding an integer object is not allowed
		//list1.add(new Integer(34));
		System.out.println(list1);
		
		//We can declare a collection of type string - ONLY Interface 
		List<String> list2 = new ArrayList<>();
		list2.add("deepak");
		//Adding an integer object is not allowed
		//list1.add(new Integer(34));
		System.out.println(list2);
		
		//the following list is of RAW type, we can add any object to the list interface, only warning
		List list3 = new ArrayList<String>();
		list3.add("Avatar");
		list3.add(new Integer(34));
		System.out.println(list3);
		
		//new ArrayList<String>().add(new Integer(34));
	}
}
