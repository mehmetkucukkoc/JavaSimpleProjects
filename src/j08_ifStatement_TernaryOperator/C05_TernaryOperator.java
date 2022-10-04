package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi= sc.nextInt();
        System.out.println((sayi % 2 == 0 ? sayi/2 : "tek"));


    }
}
