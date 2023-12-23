package week07;

public class MinNumberInArray_AR {

    public static void main(String[] args) {
        int[] array = {5, 25, 0, -25, 25, 100};
        System.out.println("minNum(array) = " + minNum(array));

        int[] array2 = {23, 25, 80, -225, 25, 1000};
        System.out.println("minNum(array2) = " + minNum(array2));

    }

    public static int minNum(int[] array){
        int min = array[0];

        for (int each : array) {
            if(each < min){
                min = each;
            }
        }
        return min;
    }


}
/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */