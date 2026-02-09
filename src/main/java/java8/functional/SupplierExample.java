package main.java.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier provides a value
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());

        // Supplier for lazy initialization
        Supplier<List<String>> listSupplier = () -> new ArrayList<>();

        List<String> list = listSupplier.get();
        list.add("Hello");
        System.out.println(list);
    }
}
