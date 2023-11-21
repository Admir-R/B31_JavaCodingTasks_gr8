package week02;

public class ConsecutiveNumbers_AR {
    public static void main(String[] args) {
        consecutiveNumbers(30);
    }

    public static void consecutiveNumbers(int n){

        for (int i = 1; i <=n ; i++) {
            String result = "";
            if(i%2==0){
                result += "Codility";
            }
            if(i%3==0){
                result += "Test";
            }
            if(i%5==0){
                result += "Coders";
            }

            if(result.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(result);
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

