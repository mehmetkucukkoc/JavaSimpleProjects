package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi = sc.nextDouble();
        if (sayi > 0) {
            System.out.println("Girdiğiniz sayı pozitif");
        } else if (sayi<0){
            System.out.println("Girdiğiniz sayı negatif");
        }
        else{
            System.out.println("Girdiğiniz sayı nötr");

        }
    }
}
