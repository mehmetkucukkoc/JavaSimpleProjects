package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        int sayi2 = scanner.nextInt();
        int sayi = 10;
        while (sayi > 0) {
            double rndSayi = Math.random() * (Math.max(sayi1,sayi2)-Math.min(sayi1,sayi2)+1)+Math.min(sayi1,sayi2);
            System.out.println((int) rndSayi);
            sayi--;
        }

    }
}


