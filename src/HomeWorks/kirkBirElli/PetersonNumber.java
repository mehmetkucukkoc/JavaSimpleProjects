package HomeWorks.kirkBirElli;

import java.util.Scanner;

public class PetersonNumber {
    static int[] factorial = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        System.out.println(isPetersonNumber(scanner.nextInt()) ? "Sayı Peterson Sayısıdır" : "Sayı Peterson Sayısı Değildir");
    }

    private static boolean isPetersonNumber(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rakam = num % 10;
            num /= 10;
            sum += factorial[rakam];

        }
        if (sum == temp) {
            return true;
        }return false;
    }
}
