package main.java.common;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

class A implements Serializable {
	public A() {
		System.out.println("A");
	}
}

public class Test {
	public static void main(String... args) throws Exception {
		A a = new A();
		ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("datafile"));
		save.writeObject(a);
		save.flush();
		ObjectInputStream restore = new ObjectInputStream(new FileInputStream("datafile"));
		A z = (A) restore.readObject();

		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean(false);
		Boolean bool3 = new Boolean("false");
		Boolean bool4 = new Boolean(bool1);
		System.out.println(bool1.equals(bool4));
		System.out.println(bool2 == bool3);
		System.out.println(bool1 == bool4);

		Set vals = new TreeSet<>();
		vals.add("one");
		vals.add(1);
		vals.add("two");
		System.out.println(vals);

	}
}
