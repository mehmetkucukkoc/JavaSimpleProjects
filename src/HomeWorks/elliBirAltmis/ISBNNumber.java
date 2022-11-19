package HomeWorks.elliBirAltmis;

import java.util.Scanner;

public class ISBNNumber {
    public static void main(String[] args) {

        checkingISBNNumber();
    }

    private static boolean checkingISBNNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a ten-digit number to check number is ISBN or not");
        String num = scan.nextLine().trim();
        long isbnNum=0;
        int sum=0;
        if (num.length() != 10) {
            System.out.println("You entered a number do not have a ten-digit number");
            checkingISBNNumber();
        }
        isbnNum = Long.parseLong(num);
for (int i =1;i<=num.length();i++) {
    sum+=isbnNum%10*i;
    isbnNum/=10;
}
        System.out.println("sum = " + sum);
        System.out.println((sum%11==0)?"ISBN Number":"Not ISBN Number");
        return false;
    }
}
