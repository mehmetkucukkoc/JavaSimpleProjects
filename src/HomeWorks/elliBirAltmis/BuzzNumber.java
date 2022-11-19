package HomeWorks.elliBirAltmis;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        System.out.println((num%7==0||num%10==7)?"Buzz Number":"Not Buzz Number");







    }
}
