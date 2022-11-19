package HomeWorks.otuzBirKirk;

import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Row Number");
        int row=scan.nextInt();
        int i, j;
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=2*(row-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
