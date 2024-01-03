package week08;

import java.util.Arrays;

public class UniqueIntegersSumUpToZero_AR {

    public static void main(String[] args) {
        int N = 8;
        int[] result = generateArray(N);
        System.out.println(Arrays.toString(result));

        int[] result1 = solution(N);
        System.out.println(Arrays.toString(result1));
    }

    public static int[] generateArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 1 and 99");
        }

        int[] array = new int[N];
        int sum = 0;

        for (int i = 0; i < N-1; i++) {
            array[i] = i;
            sum += i;
        }

        array[N-1] = -sum;// assign last index of array with negative sum to make it zero, example 15-15 = 0

        return array;
    }

    public static int[] solution(int N) {

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum;

        return result;
    }
}
/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).

 */