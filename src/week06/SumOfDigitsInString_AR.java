package week06;

public class SumOfDigitsInString_AR {

    public static void main(String[] args) {

        System.out.println("sumOfDigits(\"507ADMIR1208\") = " + sumOfDigits("507ADMIR1208"));
        System.out.println("sumOfDigits(\"785643\") = " + sumOfDigits("785643"));
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        for (char eachChar : str.toCharArray()) {
             if(Character.isDigit(eachChar)){

                 sum += Integer.parseInt(""+eachChar);

                 //sum+= Character.getNumericValue(eachChar);
            }

        }
        return sum;
    }
}
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */