package Projects;

public class ForLoop_Ex04 {

    public static void main(String[] args) {
         /*
        F E D C B A
        F E D C B
        F E D C
        F E D
        F E
        F
        şekli yazdırınız
        */
        int harf=65;//A ascii değeri
        for (int i = 0; i <=5 ; i++) {//apt döngü
            for (int j = 5; j >=i ; j--) {//daire döngü
               // System.out.print((char)(harf+j)+" ");
              System.out.print((char)(harf+j)+" ");

            }
            System.out.println();//dumy
        }for (int i = 0; i <=5 ; i++) {//apt döngü
            for (int j = 0; j <=i ; j++) {//daire döngü
                // System.out.print((char)(harf+j)+" ");
                System.out.print((char)(harf+j)+" ");

            }
            System.out.println();//dumy
        }




    }
}
