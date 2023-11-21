package week02;

public class SwappingTwoNumbers_AR {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /*
        int x;
        x = a;
        a = b;
        b = x;*/ // using third variable

    }
}
/*
Swap two variables values without using a third variable
 */

