package week01;

public class OddOrEven_Admir {
    public static void main(String[] args) {

       odd_or_even(6);
       odd_or_even(5);



    }
    public static void odd_or_even(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+ " is odd number");
        }
    }
}