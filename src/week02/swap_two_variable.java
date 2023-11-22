package week02;

public class swap_two_variable {
    public static void main(String[] args) {
//       int a=2;
//       int b=4;
//        System.out.println(" Before swapping :a=" + a +" b="+b );


        swapping(2,4);
    }
      public static void swapping(int a,  int b){
        a=a+b;
        b=a-b;
        a=a-b;

          System.out.println(" After swapping : a= "+ a+ " b="+ b);
      }


}
