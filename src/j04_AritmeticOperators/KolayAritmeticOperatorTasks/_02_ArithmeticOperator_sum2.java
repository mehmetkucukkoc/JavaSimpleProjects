package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        int num2 = scan.nextInt();
        System.out.println("Lütfen Üçüncü Sayıyı Giriniz : ");
        int num3 = scan.nextInt();
        System.out.println("Lütfen Dördüncü Sayıyı Giriniz : ");
        int num4 = scan.nextInt();
        num1+=num2+num3+num4;
        System.out.println("Toplam : "+ num1);





    }
}
