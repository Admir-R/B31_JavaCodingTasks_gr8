package week01;

public class Odd_or_even {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(4);
    }

    public static void oddOrEven(int number){
     if(number%2==0){
         System.out.println( number + " even number ");;
     }else {
         System.out.println(number + " Odd number");
     }
    }
}
