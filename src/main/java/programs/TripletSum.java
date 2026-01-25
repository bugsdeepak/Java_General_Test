package main.java.programs;

import java.util.List;

/**
 * List of elements -1, 0, 1, 2, -1, -4
 * identify all the triplet that sums to 0
 */
public class TripletSum {

    public static void findTriplet(List<Integer> integerList, int sum) {
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = i + 1; j < integerList.size(); j++) {

                if (i == j) {
                    continue;
                }
                if (j == integerList.size() - 1) {
                    continue;
                }

                if (integerList.get(i) + integerList.get(j) + integerList.get(j + 1) == sum) {
                    System.out.println(integerList.get(i) + " " + integerList.get(j) + " " + integerList.get(j + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(0,0,0);
        findTriplet(integers, 0);
        System.out.println("Hello, World!");
    }
}
