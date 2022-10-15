package BasitProjeler;

import java.util.Scanner;

public class SayiyiTersCevirme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi= scan.nextInt();
        int tersSayi=0;
        int sayac=0;
        for(;sayi!=0;sayi/=10){
           int kalan =sayi%10;
           tersSayi=tersSayi*10+kalan;
           sayac++;
        }
        System.out.println("tersSayi = " + tersSayi);
        System.out.println("basamak sayısı = " + sayac);

    }
}
