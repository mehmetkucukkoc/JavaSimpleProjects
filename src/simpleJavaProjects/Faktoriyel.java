package simpleJavaProjects;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyeli Alınacak Sayıyı Giriniz.");
        int sayi = scan.nextInt();
        int sonuc =1;
        for(int i=1;i<=sayi;i++){
            sonuc*=i;

        }System.out.println(sonuc);

    }
}
