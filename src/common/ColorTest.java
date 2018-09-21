package common;

enum Color {
	RED("Red Color"), GREEN("Blue Color"), BLUE("Blue Color");
	private String displayName;

	Color(String displayName) {
		this.displayName = displayName;
	}

	public String toString() {
		return displayName;
	}
}

public class ColorTest {
	public static void main(String[] args) {
		Color redColor = Color.RED;
		System.out.println(redColor);
		Color greenColor = Color.GREEN;
		System.out.println(greenColor);
	}
}