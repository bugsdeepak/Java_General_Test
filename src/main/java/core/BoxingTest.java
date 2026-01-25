package main.java.core;

public class BoxingTest {
	public static void main(String[] args) {
		byte b = 10;
		int c = 100;
		method(b);
		method(c);
	}

	static void method(int i) {
		System.out.println("Primitivae Type call");
	}

	static void method(Integer i) {
		System.out.println("Wrapper Type Call");
	}
} 