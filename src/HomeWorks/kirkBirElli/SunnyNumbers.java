package HomeWorks.kirkBirElli;

import java.util.Scanner;

public class SunnyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        double sayi=scan.nextDouble();
        for(double i=0;i<=sayi;i++) {
            System.out.println(isSunnyNumbers(i) ? i+" Sunny Sayısıdır" : i+" Sunny Sayısı Değildir");
        }
    }

    private static boolean isSunnyNumbers(double num) {
        double num2=num+1;

        double num2sqrt=Math.sqrt(num2);

        if(num2sqrt-Math.floor(num2sqrt)==0) {
            return true;
        }



return false;

    }
}
