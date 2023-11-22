package week02;

public class print_consecutive_number {
    public static void main(String[] args) {
consecutiveNum(24);
    }
   public   static void consecutiveNum(int n) {

       for (int i = 1; i < n; i++) {// this loop executes until the n (given the number)
          String str="";
           if (i % 2 == 0) {
              str+="Codility";
           }
           if (i % 3 == 0) {
              str+="Test";
           }
           if (i % 5 == 0) {
              str+="Colers";
           }
           if (str.isEmpty()) {// number cannot divisible print the number itself
               System.out.println(i);
           } else {
               System.out.println(str);// print expected  result
           }


       }

       }
   }

/*
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by2,3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation
of the respective words Codility, Test and Coders in the given order. For example, numbers divisible by both 2
and 3 should be replaced by CodilityTest and numbers divisible by all three numbers:2,3,5 should be
replaced by CodilityTestCoders.
 */
