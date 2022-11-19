package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int yariSayi = sayi / 2;
        int flag = 0;
        if (sayi == 0 || sayi == 1) {
            System.out.println(sayi + " asal sayı değildir");
        } else {
            for (int i = 2; i <= yariSayi; i++) {
                if (sayi % i == 0) {
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println(sayi + " asal sayıdır");
        } else System.out.println(sayi + " asal sayı değildir");

    }
}