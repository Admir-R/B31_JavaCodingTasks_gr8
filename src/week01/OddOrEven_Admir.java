package week01;

public class OddOrEven_Admir {
    public static void main(String[] args) {
        System.out.println( identify(5));
    }


    public static String  identify(int number){
        if(number % 2 == 0){
            return   "Even";
        }else{
            return "Odd";
        }
    }
    
}
