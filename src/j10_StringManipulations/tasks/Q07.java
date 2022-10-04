package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 Harfli Bir İsim Giriniz");
        String isim =scan.nextLine();
        System.out.println((isim.length() > 3 || isim.length() < 3 ? "Lütfen 3 Harfli Bir İsim Giriniz." : "Üç Harfli Bir İsim Girdiniz."));
        System.out.println((isim.charAt(0) == isim.charAt(1)) || (isim.charAt(0) == isim.charAt(2)) ? "Girdiğiniz İsim Aynı Karakterler İçermektedir" : "Girdiğiniz İsim Aynı Karakterler İçermemektedir");

    }
}