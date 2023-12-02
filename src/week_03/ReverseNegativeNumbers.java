package week_03;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(ReverseNegative(-321));

    }
    public static int ReverseNegative(int number){

        boolean negNum=number<0;
        if (negNum){
            number=-number;
        }


        int temp=0;
        while (number>0){
            temp=temp*10 + number%10;
            number=number/10;
        }
        if (negNum){
            temp=-temp;
        }
        return temp;
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */

