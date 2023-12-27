package week04;

public class RemoveDuplicates_AR {
    public static void main(String[] args) {

        System.out.println("removeDuplicate(\"AAABBBCCC\") = " + removeDuplicate("AAABBBCCC"));
    }
    public static String removeDuplicate(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+ each)){ // if the string result does not contain yet.
                result += each;
            }
        }
        return result;

    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */