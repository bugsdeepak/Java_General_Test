package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //find the odd number and even numbers from the list using streams
        numbers.stream().filter(n -> n%2 != 0).forEach(System.out::println);
        //Collectors.collectingAndThen(oddNumbers, function(numbers));

    }

    public static void function(List<Integer> numbers) {
        numbers.stream().filter(n -> n%2 == 0).toList();
    }
}
