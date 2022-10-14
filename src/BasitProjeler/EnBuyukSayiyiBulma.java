package BasitProjeler;

import java.util.Scanner;

public class EnBuyukSayiyiBulma {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("10 Adet Sayı Giriniz");
        System.out.println("Şimdi Bu Sayılardan En Büyük ve En Küçüğünü Bulacağız");
        int maks=0;
        int min=0;


        for (int i=1; i<=10; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = klavye.nextInt();

            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }

            if (sayi>maks)
                maks=sayi;

            if (sayi<min)
                min=sayi;
        }

        System.out.println("En Büyük : "+maks);
        System.out.println("En Küçük : "+min);
    }
}
