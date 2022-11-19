package HomeWorks.otuzBirKirk;

import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Row Number");
        int row=scan.nextInt();
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
