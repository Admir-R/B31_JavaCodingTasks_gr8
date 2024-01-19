package week10;

import java.util.ArrayList;

public class ArrayList_sortDesc {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(22);
        numbers.add(18);
        numbers.add(1);
        numbers.add(5);

        // Sorting in descending order without using sort method
        sortDescending(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order: " + numbers);
    }

    public static void sortDescending(ArrayList<Integer> list) {


        for (int i = 0; i < list.size() ; i++) {

            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                }
            }


        }
    }
}
/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.

 */
