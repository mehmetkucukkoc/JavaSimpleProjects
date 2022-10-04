package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        double num1 = scan.nextDouble();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        double num2 = scan.nextDouble();
        System.out.println("Lütfen Üçüncü Sayıyı Giriniz : ");
        double num3 = scan.nextDouble();
        double sonuc = num1*num2*num3;
        System.out.println("Sonuç : "+sonuc);




    }
}
