package w5;

public class FirstNonRepeatedChar {
      /*
    write a program that can return the first non-repeated character from a string
     */

    public char firstNonRepeatedChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                return str.charAt(i);
            }

        }

        return ' ';

    }
}
