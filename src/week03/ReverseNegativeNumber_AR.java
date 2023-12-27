package week03;

public class ReverseNegativeNumber_AR {


    public static void main(String[] args) {
        System.out.println(reverseNumber(-321));
        System.out.println(reverseNumber(-32));
        System.out.println(reverseNumber(-32102));
        System.out.println(reverseNumber(32102));
    }

    public static int reverseNumber(int num) {

        int reversed = 0;

        while (num < 0) {
            int lastDigit = num % 10; //get last digit
            reversed = reversed * 10 + lastDigit;// increase by 10th place each iteration
            num /= 10; //remove last digit
        }

        return reversed;
    }
}
/*
Write a return method that can reverse negative number and return it as int
 */

