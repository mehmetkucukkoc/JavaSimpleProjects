package P04_okulYönetimi.benimProjem;

import java.util.ArrayList;

public class Ogretmen extends Kisi{
    static ArrayList<Kisi> ogrtListesi = new ArrayList<>();
    private String bolum;
    private String sicilNo;


    public Ogretmen(String ad,String soyAd, String tcNo, int yas, String sicilNo, String bolum){
super(ad, soyAd, tcNo, yas);
this.bolum = bolum;
this.sicilNo= sicilNo;
    }
}
