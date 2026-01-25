package main.java.java_11_features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java11Features {

    public static void main(String[] args) {
        // Example of String methods introduced in Java 11
        String str = "  Hello, Java 11!  ";

        // strip() method to remove leading and trailing whitespace
        String strippedStr = str.strip();
        System.out.println("Stripped String: '" + strippedStr + "'");

        // isBlank() method to check if the string is empty or contains only whitespace
        String blankStr = "   ";
        System.out.println("Is blank string: " + blankStr.isBlank());

        // repeat() method to repeat the string a specified number of times
        String repeatedStr = "Java ".repeat(3);
        System.out.println("Repeated String: '" + repeatedStr + "'");

        str = " JD ";
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");

        Path path;
        try {
            path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
