package HomeWorks.onBirYirmi.ForLoopIleObjeOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Urun {
    int urunId = 0;
    String urunAdi = "";
    double urunFiyati = 0;
   static List<Urun> urunList = new ArrayList();

    public Urun(int urunId, String urunAdi, double urunFiyati) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
    }

   static void urunKaydet() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            Urun urun = new Urun(scan.nextInt(), scan.next(), scan.nextDouble());
            urunList.add(urun);
        }
    }
    static void urunListele() {
        for (int i = 0; i <= 1; i++) {
            System.out.println(urunList.get(i));
        }

    }


}
