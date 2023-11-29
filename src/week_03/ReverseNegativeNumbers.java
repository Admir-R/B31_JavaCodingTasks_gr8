package week_03;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(ReverseNegative(-21));

    }
    public static int ReverseNegative(int number){
        int positiveNum= number*(-1);
        return positiveNum;
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */

