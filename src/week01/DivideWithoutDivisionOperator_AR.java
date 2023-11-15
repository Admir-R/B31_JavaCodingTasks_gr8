package week01;

public class DivideWithoutDivisionOperator_AR {

    public static void main(String[] args) {
        divide(100, 9);
    }

    public static void divide(double num1 ,double num2 ){
        int count = 0;

        while(num1 >= num2){
            num1 -= num2;
            count++;
        }

        System.out.println(count + " with remainder of "+ num1);
    }
}
