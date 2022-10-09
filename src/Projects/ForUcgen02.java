package Projects;
import java.util.Scanner;

public class ForUcgen02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi= scan.nextInt();

        for (int i=1;i<=sayi; i++){
            for (int j =0; j <sayi-i ; j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=sayi-1;i>0;i--){
            for (int j =0; j <sayi-i ; j++){
                System.out.print(" ");
            }for(int m=0;m<2*i-1;m++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
