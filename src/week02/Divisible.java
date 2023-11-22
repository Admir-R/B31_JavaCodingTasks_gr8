package week02;

public class Divisible {

    public static void main(String args[]) {

      divisible(100);

    }

    public static void divisible(int n){
        System.out.println("Divisible by 15");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                // System.out.println("Divisible by 15");
                System.out.print(i + ",");// Print numbers divided by 3,5,15
            }

        }
        System.out.println();// this is just for separate the line
        System.out.println("Divisible by 5");
        for (int j = 1; j < n; j++) {
            if (j % 5 == 0 && j % 15 != 0) {
                System.out.print(j + ",");
            }

        }

        System.out.println();
        System.out.println("Divisible by 3");
        for (int k = 1; k < n; k++) {
            if (k % 3 == 0 && k % 15 != 0) {
                System.out.print(k + ",");
            }
        }
    }

}




   /* Output:

    Divided by 3:
            3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
            , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

    Divided by 5:
            5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
            95,

    Divided by 3 & 5:
            15, 30, 45, 60, 75, 90,



*/






