package programs;

import java.util.ArrayList;
import java.util.List;

public class RotateMatrix90Degree {
    private static void rotateMatrix(List<List<Integer>> listofList) {

        List<List<Integer>> roatedList = new ArrayList<>();
        //initialize inner Lists
        int colum = listofList.get(0).size();
        for(int i=0; i< colum; i++) {
            List<Integer> row = new ArrayList<>(colum);
            //initalized some default values
            for(int j=0; j<colum; j++) {
                row.add(-1);
            }
            roatedList.add(row);
        }

        for(int i=0 ; i<listofList.size(); i++) {
            //first row
            List<Integer> inputRow = listofList.get(i);
            //all the values in the first row
            for (int j = 0; j < inputRow.size(); j++) {
                //Tranformation
                roatedList.get(j).set(colum - 1, inputRow.get(j));
            }
            colum = colum - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        firstRow.add(2);
        firstRow.add(3);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(4);
        secondRow.add(5);
        secondRow.add(6);
        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(7);
        thirdRow.add(8);
        thirdRow.add(9);

        List<List<Integer>> oringalList = new ArrayList<>();
        oringalList.add(firstRow);
        oringalList.add(secondRow);
        oringalList.add(thirdRow);

        rotateMatrix(oringalList);
        //List<Integer>
    }
}
