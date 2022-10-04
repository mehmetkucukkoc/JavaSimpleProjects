package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        int num2 = scan.nextInt();
        num1 %=num2;
        System.out.println("Sonuç : "+num1);

    }
}
