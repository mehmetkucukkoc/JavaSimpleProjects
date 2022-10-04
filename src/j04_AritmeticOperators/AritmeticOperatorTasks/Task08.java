package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Saniye Giriniz : ");
        int saniye=scan.nextInt();
        int saat = saniye/3600;
        int saatKalan=saniye%3600;
        int dakika = saatKalan/60;
        int dakikaKalan = saatKalan%60;
        System.out.println(saniye + " saniye " + saat +" saat "+ dakika+ " dakika " + dakikaKalan+" saniye");
    }
}
