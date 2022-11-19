package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi= scan.nextInt();
        int tempSayi=sayi;
        int tersSayi=0;
        int kalan=0;
        while(sayi>0){
            kalan=sayi%10;
            tersSayi=tersSayi*10+kalan;
            sayi/=10;
        }
        if(tempSayi==tersSayi){
            System.out.println(tempSayi+" sayısı polindrome");
        }else System.out.println(tempSayi+" sayısı polindrome değil");
    }
}
