package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

/* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner sc =new Scanner(System.in);
        int sayi;
        System.out.println("Lütfen Bir Tam Sayı Giriniz");
        sayi=sc.nextInt();
        if(sayi%2==0){
            System.out.println("sayı çift");
        }else System.out.println("sayı tek");

        String sonuc = (sayi%2==0 ? "çift":"tek");

        System.out.println(sonuc);
        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.

        System.out.println(sayi < 0 ? "negatif" : "negatif değil");


    }
}
