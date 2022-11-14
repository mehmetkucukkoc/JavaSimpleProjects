package HomeWorks.birOn;

import java.util.Scanner;

public class Exceptions10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci sayıyı Giriniz");
        int sayi2 = scan.nextInt();
        try {
            int oran = sayi1 / sayi2;
            System.out.println(oran);
        }catch(ArithmeticException e){
            System.out.println("Bölen Sayı 0 Olamaz");
        }
    }
}
