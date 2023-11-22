package week02;

import java.util.ArrayList;

public class print_consecutive_number {
    public static void main(String[] args) {

        for (int i = 1; i < 25; i++) {
           if(i%2==0){
               System.out.println("Codility");
           } else if (i%3==0) {
               System.out.println("Test");
           } else if (i%5==0) {
               System.out.println("Colers");
           } else if (i%2==0 && i%3==0) {
               System.out.println(" CodilityTest");
           } else if (i%2==0 &&  i%5==0) {
               System.out.println(" CodilityCoder");
           }else if(i%3==0 && i%5==0) {
               System.out.println("testCoder");
           } else if (i%2==0 && i%3==0 && i%5==0) {
               System.out.println("CodilityTestCoder ");
           } else {
               System.out.println(i);
           }




        }

    }}





