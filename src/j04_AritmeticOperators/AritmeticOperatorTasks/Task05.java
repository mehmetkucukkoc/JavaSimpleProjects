package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Saat Giriniz : ");
        int saat=scan.nextInt();
        System.out.println("Lütfen Dakika Giriniz : ");
        int dakika=scan.nextInt();
        System.out.println("Lütfen Saniye Giriniz : ");
        int saniye=scan.nextInt();
        int toplamSaniye=saat*3600+dakika*60+saniye;
        System.out.println("Toplam Saniye = " + toplamSaniye);


    }

}
