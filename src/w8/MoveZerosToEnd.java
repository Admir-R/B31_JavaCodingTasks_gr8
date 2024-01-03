package w8;

import java.util.Arrays;

public class MoveZerosToEnd {
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToTheEnd(new int[]{1, 2, 3, 0, 4, 0, 5})));
    }
}
