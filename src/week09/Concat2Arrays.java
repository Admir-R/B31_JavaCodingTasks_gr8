package week09;

import java.util.Arrays;

public class Concat2Arrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 5, 6, 7};

        int[] result = concatenateArrays(array1, array2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];

        //copy element from array1
        for (int i = 0; i < array1.length; i++) {
           result[i] = array1[i];
        }

        //copy element from array2
        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }

        return result;
    }

}
/*
Write a return method that can concat two arrays
 */