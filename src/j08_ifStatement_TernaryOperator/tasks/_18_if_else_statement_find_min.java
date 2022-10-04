package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if(i1<i2&&i1<i3)
            System.out.println("En küçük sayı "+i1);
        if(i2<i1&&i2<i3)
            System.out.println("En küçük sayı "+i2);
        if(i3<i2&&i3<i1)
            System.out.println("En küçük sayı "+i3);
        System.out.println(Math.min(i2,i3));


    }
}
