package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        int num2 = scan.nextInt();
        System.out.println("Lütfen Üçüncü Sayıyı Giriniz : ");
        int num3 = scan.nextInt();
        System.out.println("Lütfen Dördüncü Sayıyı Giriniz : ");
        int num4 = scan.nextInt();
        int sonuc = num1*num2*num3*num4;
        System.out.println("Sonuç : "+sonuc);



    }
}
