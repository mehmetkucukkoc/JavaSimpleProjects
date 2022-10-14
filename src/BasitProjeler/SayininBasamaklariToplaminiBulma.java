package BasitProjeler;

import java.util.Scanner;

public class SayininBasamaklariToplaminiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi= scan.nextInt();
        int basamakToplam=0;
        for(;sayi!=0;sayi/=10){
           int kalan =sayi%10;
           basamakToplam+=kalan;
        }
        System.out.println("basamakToplam = " + basamakToplam);

    }
}
