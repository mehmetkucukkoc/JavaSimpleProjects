package ArrayListTasks.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        Scanner sc = new Scanner(System.in);
        int meyveSecim=0;
        int kg = 0;
        int toplamFiyat = 0;
        List<String> meyveList = new ArrayList<>(List.of("Elma", "Portakal", "Armut", "Üzüm", "İncir"));
        List<Integer> meyveFiyat = new ArrayList<>(List.of(15, 10, 25, 20, 40));
        System.out.println("Meyve Listemiz = " + meyveList);
        for (int i = 0; i < meyveList.size(); i++) {
            System.out.println(meyveList.get(i) + " için " + i + " Sayısına Basınız");
            meyveSecim=sc.nextInt();
            System.out.println(meyveList.get(meyveSecim)+" Seçtiniz.");

        }
       // System.out.println("Kaç Kg " + meyveList.get(i) + " Almak İstiyorsunuz");
       // kg = sc.nextInt();
       // toplamFiyat = meyveFiyat.get(i) * kg;
       // System.out.println("toplamFiyat = " + toplamFiyat);


    }


}

