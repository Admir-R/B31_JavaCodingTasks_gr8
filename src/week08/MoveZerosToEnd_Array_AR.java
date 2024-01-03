package week08;

import java.util.Arrays;

public class MoveZerosToEnd_Array_AR {

    public static void main(String[] args) {
        int[] numbers = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZerosToEnd(numbers)));
        int[] numbers2 = {0,0,25,13,0,100,10,0,8,0,12};
        System.out.println(Arrays.toString(moveZerosToEnd(numbers2)));
    }

    public static int[] moveZerosToEnd(int[] numbers){
        int[] newArray = new int[numbers.length];
        int index = 0;

        for (int each : numbers) {
            if(each != 0){
                newArray[index++] = each;
            }
        }
        return newArray;
    }

}

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array
(Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,0]

 */