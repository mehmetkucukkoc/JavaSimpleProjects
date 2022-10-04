package j07_Logical_Mantıksal_Operators.benim;

import java.util.Scanner;

public class BenimMainClass {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String cinsiyet ="Erkek, Kadın";
        int yas;
        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        cinsiyet=scan.nextLine();
        if (cinsiyet.equals("Bayan")){
            System.out.println("BAYAN OLDUĞUNUZ İÇİN ASKERLİK YAPAMAZSINIZ.");
        }
        else {System.out.println("Lütfen Yaşınızı Giriniz");
            yas=scan.nextInt();
            if (yas>=20){
                System.out.println("ASKERLİK ÇAĞINDASINIZ.");

            }
            else {System.out.println("ASKERLİK ÇAĞINDA DEĞİLSİNİZ.");}

        }

    }


}