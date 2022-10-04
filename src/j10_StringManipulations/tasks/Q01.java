package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir String Değer Giriniz.");
        String input = scan.nextLine();
        String bosluk = " ";
        if (input.contains(bosluk)) {
            System.out.println("Girdiğiniz Değerde Boşluk Bulunmaktadır");

        } else System.out.println("Girdiğiniz Değerde Boşluk Bulunmamaktadır");


    }
}

