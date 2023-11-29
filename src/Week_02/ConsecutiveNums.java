package Week_02;

public class ConsecutiveNums {
    public static void main(String[] args) {
        consecutiveNum(15);
    }
    public static void consecutiveNum(int num){

        for (int i = 1; i <=num ; i++) {
            String result = "";
            if(i%2==0){
                result += "Codility";
            }
            if(i%3==0){
                result += "Test";
            }
            if(i%5==0){
                result += "Coders";
            }

            if(result.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(result);
            }
        }
    }
}
