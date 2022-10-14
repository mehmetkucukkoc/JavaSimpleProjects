package ScannerClass;

import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {

        /*
        Scanner sınıfının parametre olarak aldığı string değişkeninde
        ilk kelimeden sonra veri olup olmadığı kontrol etmek için
        ,kullandığımız fonksiyondur. Daha iyi anlaşılması için örneğimize bakınız.



Geri Dönüş Değeri ( boolean ) ;

true ( ilk sozcukten sonra veri tipi var )
false ( ilk sozcukten sonra veri tipi yok )
         */
        String sozce = "KodSozluk Ekibi";

        Scanner sc = new Scanner(sozce);
        System.out.println(sc.next() + " 'ten sonra veri varmı " + sc.hasNext());

        sc = new Scanner("KodSozluk Ekibi");
        System.out.println(sc.next() + " 'ten sonra veri varmı " + sc.hasNext());
    }
}
