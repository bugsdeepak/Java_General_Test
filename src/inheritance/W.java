package inheritance;

public class W {
	
	public static void main(String[] args) {
		Y c1 = new Z();
		System.out.println(c1.getNumber().getVal());
		Y c2 = new Y();
		System.out.println(c2.getNumber().getVal());
	}
	
	public Number getNumber() {
		return 1;
	}

}

class X extends W {
	
	// When overriding a method even the return type should match
	//otherwise compilation error - The return type is incompatible with A.getNumber()
	
	public  Number /* int */ getNumber() {
		return 2;
	}
	
}

class MyInt {
	private int val;
	MyInt(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
}

class MyLong extends MyInt {
	MyLong(int val) {
		super(val);
	}
}

class Y {
	
	public MyInt getNumber() {
		return new MyInt(12);
	}
}

class Z extends Y {
	
	// When overriding a method = the method can return a type of the base class return type
	public MyLong getNumber() {
		return new MyLong(23);
	}
}