package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingExercise {

    public static void PrintIndexOfArray(int[] arr, int element ) {
        Arrays.sort(arr);
        int sum = 0;
        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element ) {
                System.out.println("Element found at index: " + i);
                break;
            }


             if (sum == element) {
              // Print all indexes
                printAllIndexes(indexList);
                break;
            } else if (sum < element) {
                sum = sum + arr[i];
                indexList.add(i+1);
            }
            else if (sum > element) {
                //do nothing

            }

            if(i == arr.length-1) {
                System.out.println("Element not found");
            }

        }
    }

    private static void printAllIndexes(List<Integer> indexList) {
        for (int i = 0; i < indexList.size(); i++) {
            System.out.print(indexList.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 15;
        PrintIndexOfArray(arr, element);
    }
}
