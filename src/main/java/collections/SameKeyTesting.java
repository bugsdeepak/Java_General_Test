package main.java.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SameKeyTesting {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
        
		//When the same key is used in Hash related Collection.
		//When I add the same key again with different value.
		//The hashmap finds the location for the Key and just store the value
		//in the location. It does not check that already a value is there or not.
        Map map = new HashMap();
        map.put("a", "antony");
        map.put("a", "antonydeepak");
        System.out.println("Map values = " + map);
        //This is strange But the reason could be => 
        //if I want to update the value for the same key.
        
        //The hashtable also behaves in the same way. Same key -> override value.
        Map map1 = new Hashtable();
        map1.put("a", "antony");
        map1.put("a", "antonydeepak");
        System.out.println("Map1 values = " + map1);
	}
}
