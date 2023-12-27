package week03;

public class PrimeNumber_AR {

    public static void main(String[] args) {

        System.out.println("31 = "+isPrime(31));
        System.out.println("1 = "+isPrime(1));
        System.out.println("8 = "+isPrime(8));
    }

    public static boolean isPrime(int n){

        if(n < 2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
/*
Write a method that can check if a number is prime or not
 */

