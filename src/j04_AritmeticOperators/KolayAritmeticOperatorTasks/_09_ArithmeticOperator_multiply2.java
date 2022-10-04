package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
        double num1 = scan.nextDouble();
        System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
        double num2 = scan.nextDouble();
        System.out.println("Lütfen Üçüncü Sayıyı Giriniz : ");
        double num3 = scan.nextDouble();
        System.out.println("Lütfen Dördüncü Sayıyı Giriniz : ");
        double num4 = scan.nextDouble();
        double sonuc = num1*num2*num3*num4;
        System.out.println("Sonuç : "+sonuc);

    }
}
