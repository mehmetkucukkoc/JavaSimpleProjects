package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        parametre int olarak girilen değeri return eder
        parametre değeri 0 dan başlar.

        String sehir="Istanbul";
        char besinciIndexKrktr=sehir.charAt(5);
        System.out.println(besinciIndexKrktr);
        System.out.println(sehir.charAt(sehir.length() - 1));
        System.out.println(sehir.charAt(18));
        //index boyutunu geçerse rte verir
        //son index karakteri length-1
        //ilk index karakteri charAt(0)

         */
        //Task--< istanbul kelimesinin ortadaki karakteri print eden kod create ediniz
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Bir Şehir İsmi Giriniz.");
        String input =scan.nextLine();
        if((input.length()%2)!=0){
            System.out.println(input.charAt((input.length()-1)/2));
        }else System.out.println("Bu şehrin orta harfi yoktur");

    }
}
