package collections;

import java.util.IdentityHashMap;

public abstract class IdentityHashMapTest {

	   public static void main(String args[]) {
	        IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();
	      
	        identityMap.put("sony", "bravia");
	        identityMap.put(new String("sony"), "mobile");
	      
	       //size of identityMap should be 2 here because two strings are different objects
	        System.out.println("Size of IdentityHashMap: " + identityMap.size());
	        System.out.println("IdentityHashMap: " + identityMap);
	      
	        identityMap.put("sony", "videogame");
	      
	         //size of identityMap still should be 2 because "sony" and "sony" is same object
	        System.out.println("Size of IdentityHashMap: " + identityMap.size());
	        System.out.println("IdentityHashMap: " + identityMap);
	    
	   }
	}