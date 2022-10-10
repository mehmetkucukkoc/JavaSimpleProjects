package Projects;

public class ForLoop_Ex02 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        for (int i = 0; i <6 ; i++) {//apt döngü
            for (int j = 5; j >=i ; j--) {//daire döngü
                for (int k=0; k<=j;k++){
                    System.out.print(" ");
                }
               // System.out.print((char)(harf+j)+" ");
              System.out.print("*");

            }
            System.out.println();//dumy
        }for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }System.out.println();//dumy
        }




    }
}
