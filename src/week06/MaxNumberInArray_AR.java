package week06;

import java.util.Arrays;

public class MaxNumberInArray_AR {

    public static void main(String[] args) {
       int[] array = {5, 25, 0, -25, 25, 100};
        System.out.println("maxNum(array) = " + maxNum(array));

    }

    public static int maxNum(int[] array){
        int max = array[0];

        for (int each : array) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }

}
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
