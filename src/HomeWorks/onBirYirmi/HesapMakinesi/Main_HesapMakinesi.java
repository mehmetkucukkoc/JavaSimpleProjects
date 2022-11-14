package HomeWorks.onBirYirmi.HesapMakinesi;

import HomeWorks.onBirYirmi.HesapMakinesi.HesapMakinesi;

import java.util.Scanner;

public class Main_HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci sayıyı Giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("İşlemi Seçiniz");
        char islem = scan.next().charAt(0);
        HesapMakinesi makine = new HesapMakinesi(sayi1, sayi2, islem);
makine.hesapla();

    }

}
