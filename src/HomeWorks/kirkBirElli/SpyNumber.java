package HomeWorks.kirkBirElli;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int sayi=sc.nextInt();
        int sum=0;
        int multiply=1;

        while(sayi!=0){
            sum+=sayi%10;
            multiply*=sayi%10;
            sayi/= 10;

        }
        System.out.println((multiply==sum)?"Spy Number":"Not Spy Number");
    }
}
