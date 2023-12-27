package week02;

public class NumbersDivisibleBy3_5_15_AR {
    public static void main(String[] args) {

        String dBy15 = "";
        String dBy3 = "";
        String dBy5 = "";
        for (int i =1 ; i <=100 ; i++) {
            if(i%15==0){
                dBy15 += i+ " ";
            }else if(i%5==0){
                dBy5 += i+ " ";
            }else if(i%3==0){
                dBy3 += i+ " ";
            }
        }
        System.out.println("Divisible by 15: "+dBy15 +"\nDivisible by 5: "+dBy5 +"\nDivisible by 3: "+dBy3);
    }
}
/*
Write a program that can print the numbers between 1~100 that can be divisible by 3, 5, 15.
If the number can be divisible by 3,5,15 it should only be displayed in DivisibleBy15 section
If the number can be divisible by 3 but cannot be divisible by 15 it should only be displayed in DivisibleBy3 section
If the number can be divisible by 5 but cannot be divisible by 15 it should only be displayed in DivisibleBy5 section

 */

