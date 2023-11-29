package w3;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNum(-53));
    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }

        return Integer.valueOf(str);
    }
    public static int reverse(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }


    /*
    public static int reverseNum(int  num) {
 // first approach
       String str = new StringBuilder(""+num).reverse().toString();

      if(num < 0) {
           str = "-"+str.substring(0, str.length()-1);
       }

        return Integer.parseInt(str);

  // second approach

        String numAsStr=String.valueOf(num);
        String[] numInStrArray=numAsStr.split("");
        //System.out.println(Arrays.toString(numInStrArray));
        String result="";
        for (int i = numInStrArray.length-1; i >0 ; i--) {
            result+=numInStrArray[i];
        }
        return -1*Integer.parseInt(result);
    }*/

}
