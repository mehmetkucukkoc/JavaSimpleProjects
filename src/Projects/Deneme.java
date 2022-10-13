package Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç Adet Sayi Gireceksiniz");
        int toplam = 0;
        int sayac = 0;
        int sayiAdet = scan.nextInt();
        int sayi[] = new int[sayiAdet];
        for (int i = 0; i < sayi.length; i++) {
            System.out.println("Lütfen " + i + ". İndeksi Giriniz");
            sayi[i] = scan.nextInt();
            toplam += sayi[i];
        }
        for (int i = 0; i < sayi.length; i++) {
            if (toplam / sayiAdet < sayi[i]) {
                sayac++;
            }
        }
        System.out.println("Ortalamadan Büyük Olan Eleman Sayısı : "+sayac);
        System.out.println("Ortalama : "+(toplam/sayiAdet));
        System.out.println(Arrays.toString(sayi));

    }


}





