package week04;

public class SameLetters_AR {
    public static void main(String[] args) {
        System.out.println("hasSameLetters(\"abc\", \"cab\") = " + hasSameLetters("abc", "cab"));
        System.out.println("hasSameLetters(\"madam\", \"adamm\") = " + hasSameLetters("madam", "adamm"));
        System.out.println("hasSameLetters(\"taxi\", \"uber\") = " + hasSameLetters("taxi", "uber"));

    }

    public static boolean hasSameLetters(String str1, String str2){

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i); // each character from str1

            for (int k = 0; k < str2.length(); k++) {
                char each = str2.charAt(k); //  each char from str2
                if(ch==each){
                    return true;
                }
            }

        }
        return false;
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */