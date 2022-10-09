package Projects;
import java.util.Scanner;
public class ForUcgen01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi= scan.nextInt();

        for (int i=1;i<=sayi; i++){
            for (int j =0; j <i ; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
