package week01;

public class FINRA_AR {

    public static void main(String[] args) {
        System.out.println(finra());
    }

    public static String finra(){
        String result = "";
        for (int i = 1; i < 31; i++) {
            if(i % 15 == 0){
                result += "FINRA ";
            }else if(i % 5 == 0){
                result += "RA ";
            }else if(i % 3 == 0){
                result += "FIN ";
            }else{
                result += i + " ";
            }
        }
        return result;
    }

}
