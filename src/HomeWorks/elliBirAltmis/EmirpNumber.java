package HomeWorks.elliBirAltmis;

import java.util.Scanner;

public class EmirpNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % 2 == 0) {
                System.out.println("Not Emirp Number");
                return;
            }

        }
        int remainder = 0;
        int reverseNum = 0;

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
        if (reverseNum % 2 == 0) {
            System.out.println("Not Emirp Number");
            return;
        } else System.out.println("Emirp Number");


    }
}
