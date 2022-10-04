package simpleJavaProjects;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç Tane Sayıyı Toplamak İstiyosunuz.");
        int tane = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i <= tane; i++) {
            System.out.println("Öyleyse "+i + ". Sayınızı Giriniz.");
            int sayi = scan.nextInt();
            toplam+=sayi;
        }

        System.out.println("Girdiğiniz Sayıların Toplamı: "+toplam);

    }
}
