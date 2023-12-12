package week05;

public class FindUnique_AR {

    public static void main(String[] args) {

        System.out.println("findUnique(\"AAABBBCCCDEF\") = " + findUnique("AAABBBCCCDEF"));

    }

    public static String findUnique(String str) {

        String unique = "";

        for (int k = 0; k < str.length(); k++) {
            char ch = str.charAt(k);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }

        }
        return unique;

    }


}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */