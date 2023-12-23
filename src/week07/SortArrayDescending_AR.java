package week07;

import java.util.Arrays;

public class SortArrayDescending_AR {

    public static void main(String[] args) {
        int[] array = {10,20,7, 8, 90};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call the method to sort the array
        sortDescending(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));

        int[] array2 = {1,2,3,4,5};
        System.out.println("Original(array2) = " + Arrays.toString(array2));
        sortDescending(array2);
        System.out.println("Sorted(array2) = " + Arrays.toString(array2));
    }

    public static void sortDescending(int[] array) {


        for (int i = 0; i < array.length ; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }


        }
    }

}
/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */