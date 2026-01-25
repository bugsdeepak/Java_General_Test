package main.java.innerclasses;

public class InnerClassTest implements Cloneable {
	
	public Object clone() {
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	short s = 10;
	public static void main(String[] args) {
		Airplane.cockPit cockpit = new Airplane().new cockPit();
		cockpit.printVariables();
	}
}

class Airplane {
	String code = "11";
	class cockPit {
		String code = "22";
		public void printVariables() {
			System.out.println("inner code = " + code);
			System.out.println("outer code = " + Airplane.this.code);
		}
	}
}