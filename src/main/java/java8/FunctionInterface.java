package main.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = x -> x + 1;
        Function<Integer, Integer> f2 = x -> x * 2;
        System.out.println(f1.andThen(f2).apply(3));  // Output: 8
        f1.apply(4); // Output: 5

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("a", 1);
        Integer val = map.computeIfPresent("a", (k, v) -> v + 1);
        System.out.println(val + " " + map.get("a"));

        String s = " Hello World ";
        System.out.println(s.strip().replace(" ", "-"));

        List<Integer> nums = Arrays.asList(1, 2, 3);
        nums.stream()
                .map(n -> n * 2)
                .filter(n -> n > 2)
                .forEach(System.out::print);

    }

}
