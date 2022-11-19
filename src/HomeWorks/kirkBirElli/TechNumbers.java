package HomeWorks.kirkBirElli;

import java.util.Scanner;

public class TechNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int i = scan.nextInt();

        System.out.println(isTechNumber(i) ? i + " Tech Sayısıdır" : i + " Tech Sayısı Değildir");

    }

    private static boolean isTechNumber(int i) {
        int digit = 0;
        int firstHalf = 0;
        int secondHalf = 0;
        int sumOfHalves = 0;
        int num = i;
        while (i > 0) {
            digit++;
            i /= 10;
        }
        i = num;
        if (digit % 2 == 0) {

            firstHalf = i % (int) Math.pow(10, digit / 2);
            secondHalf = i / (int) Math.pow(10, digit / 2);
            sumOfHalves = firstHalf + secondHalf;

        } else {
            System.out.println("Lütfen Çift Rakamlı Sayı Giriniz");
            
        }
        if (i == sumOfHalves * sumOfHalves) {
            return true;
        }
        return false;
    }
}
