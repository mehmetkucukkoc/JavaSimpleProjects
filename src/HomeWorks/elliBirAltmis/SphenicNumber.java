package HomeWorks.elliBirAltmis;

import java.util.Scanner;

public class SphenicNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int carpim = 1;
        int counter = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {

                for (int j = 2; j <= i; j++) {

                    if (i % j == 0) {
                        counter++;
                    }
                } if (counter > 2) {

                } else {
                    carpim *= i;}
                counter = 0;
                          }
        } System.out.println((carpim==num)?"Sphenic Number":"Not Sphenic Number");
    }
}