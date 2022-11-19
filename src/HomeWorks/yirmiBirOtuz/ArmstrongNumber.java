package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            System.out.println(getArmstrong(i));
        }
    }

    private static String getArmstrong(int sayi) {
        int count = 0;
        int basamak = 0;
        int temp = sayi;
        int toplam = 0;
        while (sayi > 0) {
            count++;
            sayi /= 10;

        }
        sayi = temp;
        while (sayi > 0) {
            basamak = sayi % 10;
            toplam += Math.pow(basamak, count);
            sayi /= 10;
        }
        sayi = temp;

        if (sayi == toplam) {
            return sayi +" Sayısı Armstrong Sayısıdır";
        } else return sayi+ " Sayısı Armstrong Sayısı Değildir";

    }
}