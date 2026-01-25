package main.java.java_11_features;

public class SwitchCaseExample {


    public static void main(String[] args) {
        String day = "MONDAY";

        // Using switch expression (Java 12 and later)
        String result = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> "6";
            case "TUESDAY" -> "7";
            case "THURSDAY", "SATURDAY" -> "8";
            case "WEDNESDAY" -> "9";
            default -> "Invalid day";
        };

        System.out.println("The result is: " + result);
    }
}
