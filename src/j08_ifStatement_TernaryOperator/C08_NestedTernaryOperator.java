package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

/*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        Scanner sc =new Scanner(System.in);
        System.out.println("ürün miktarı giriniz.");
        int urunMiktarı=sc.nextInt();
        System.out.println("ürün birim fiyatı giriniz.");
        int urunBirimFiyatı=sc.nextInt();
       double fatura = (urunMiktarı > 100 ? (urunMiktarı * (urunBirimFiyatı - urunBirimFiyatı * 33 / 100)) : urunMiktarı * urunBirimFiyatı);

System.out.println(fatura);
    }
}
