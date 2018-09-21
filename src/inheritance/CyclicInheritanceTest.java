package inheritance;

public class CyclicInheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Cyclic object reference test
		A a1 = new A();

	}

}

// If we write A extends C -> then comiler error
// "The hierarchy of the Type A is consistent"
class A {
	
	static {
		System.out.println("static block of A");
	}
	
	A() {
		System.out.println("constructor of A");
	}
	B b = new B();
}

class B extends A {
	
	C c  = new C();
}

class C extends B {
	
	A a = new A();
}