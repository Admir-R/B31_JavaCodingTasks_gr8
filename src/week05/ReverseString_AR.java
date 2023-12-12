package week05;

public class ReverseString_AR {

    public static void main(String[] args) {
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
        System.out.println("reverse(\"ADMIR\") = " + reverse("ADMIR"));
    }

    public static String reverse(String str){

        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            reverse += ch;

        }
        return reverse;

    }
}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */