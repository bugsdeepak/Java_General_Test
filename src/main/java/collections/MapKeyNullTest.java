package main.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapKeyNullTest {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		intMap.put(1, 34);
		intMap.put(1, 234);
		System.out.println("Integer value in Hash Map = " + intMap.get(1));
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("", "value1");
		map.put(" ", "value2");
		System.out.println("The Map collection can take Key string as empty quotes and with space");
		
		System.out.println("Val1 = " + map.get(""));
		System.out.println("Val2 = " + map.get(" "));
		
		
	}

}
