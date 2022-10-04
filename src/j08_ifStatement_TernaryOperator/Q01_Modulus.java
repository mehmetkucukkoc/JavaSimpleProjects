package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        int x =12345;
        System.out.println((x/10000)%10);
        System.out.println((x/1000)%10);
        System.out.println((x/100)%10);
        System.out.println((x/10)%10);
        System.out.println(x%10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        int y = sc.nextInt();
        int ilkIki=y/1000;
        int sonIki=y%100;
        int bir =ilkIki/10;
        int iki=ilkIki%10;
        int dort=sonIki/10;
        int bes=sonIki%10;
        System.out.println("Toplam : "+(bir+iki+dort+bes));



    }
}
