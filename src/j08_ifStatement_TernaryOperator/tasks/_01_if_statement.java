package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _01_if_statement {

    public static void main(String[] args) {

    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi1 = sc.nextInt();
        System.out.println("Lütfen ikinci bir sayı giriniz.");
        int sayi2 = sc.nextInt();
        if(sayi1>sayi2)
            System.out.println("int 1 is greater than 2");
        if(sayi1<sayi2)
            System.out.println("int 1 is smaller than 2");



    }
}
