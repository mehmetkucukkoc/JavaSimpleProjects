package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        TASK-->girilen bir karakterin harf olup oladığını kontrol ediniz.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir karakter giriniz : ");
        char krktr =sc.nextLine().charAt(0);
        if((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z'))
        {System.out.println("harfdir: ");}
        else System.out.println("harf değildir.");



    }
}
