package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        int num2 = scan.nextInt();
        System.out.println("Lütfen Üçüncü Sayıyı Giriniz : ");
        int num3 = scan.nextInt();
        System.out.println("Lütfen Dördüncü Sayıyı Giriniz : ");
        int num4 = scan.nextInt();
        num1-=num2+num3+num4;
        System.out.println("Fark: "+ num1);

    }
}
