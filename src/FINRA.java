public class FINRA {
    public static void main(String[] args) {
FINRA(30);
        FINRA(2);
    }

    public static void FINRA(int numbers){

        for (int i = 1; i <=numbers ; i++) {
            if(i%3==0){
                System.out.println(" fIN");
            }else if(i%5==0) {
                System.out.println("RA");
            }else if(i%3==0 && i%5==0){
                System.out.println("FINRA");
            }else {
                System.out.println(numbers);
            }

        }

    }
}
