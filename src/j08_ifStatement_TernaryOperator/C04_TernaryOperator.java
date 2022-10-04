package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz.");
        int sayi= sc.nextInt();
        System.out.println(sayi%10>=0?"sayı iki veya daha fazla basamaklı":"sayı iki basamaktan az");





    }
}
