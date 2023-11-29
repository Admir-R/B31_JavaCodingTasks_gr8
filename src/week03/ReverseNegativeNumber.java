package week03;

public class ReverseNegativeNumber {

    public static int ReverseNumber(int num) {

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}








