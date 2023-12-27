package week04;

public class FrequencyOfCharacters_AR {
    public static void main(String[] args) {

        System.out.println("frequency(\"aaabbbbdddddsssss\") = " + frequency("aaabbbbdddddsssss"));

    }

    public static String frequency(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // each character from string
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
              char each = str.charAt(k); // find frequency of each char
              if(ch==each){
                  count++;
              }
            }

            if(result.contains(""+ch)){
                continue;
            }
            result += ch;
            result += count;
        }
        return result;
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */