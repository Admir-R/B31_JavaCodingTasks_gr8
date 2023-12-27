package week07;

import java.util.Arrays;

public class SortArrayAscending_AR {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call the method to sort the array
        sortAscending(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));

        int[] array2 = {1,2,3,4,5};
        System.out.println("Original(array2) = " + Arrays.toString(array2));
        sortAscending(array2);
        System.out.println("Sorted(array2) = " + Arrays.toString(array2));
    }

    public static void sortAscending(int[] array) {

        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */