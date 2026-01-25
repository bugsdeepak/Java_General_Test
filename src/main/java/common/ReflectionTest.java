package main.java.common;

import java.lang.reflect.Method;

public class ReflectionTest {
	
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("main.java.common.ObjectArgTest");
			Method method = clazz.getMethod("printHELLO", null);
			method.invoke(null, null);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
