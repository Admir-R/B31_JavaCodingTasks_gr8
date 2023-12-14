package week_03;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Number 29 is Prime? " + PrimeNum(29));
        System.out.println("Number 30 is Prime? " + PrimeNum(30));

    }

    public static boolean PrimeNum(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            } else {
                return true;
            }

        }
        return false;
    }
}




/*
Numbers -- Prime Number
Write a method that can check if a number is
prime or not

 */
