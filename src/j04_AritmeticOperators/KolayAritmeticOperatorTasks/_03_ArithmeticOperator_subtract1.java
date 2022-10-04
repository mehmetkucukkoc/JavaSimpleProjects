package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        int num1=scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        int num2=scan.nextInt();
        num1-=num2;
        System.out.println("Fark : "+ num1);

    }
}
