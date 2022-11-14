package P04_okulYönetimi.benimProjem;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends Kisi{
    private String ogrenciNo;
    private String ogrenciSinif;
    static List<Kisi> ogrncListesi = new ArrayList<>();

    public Ogrenci(String ad,String soyAd, String tcNo, int yas, String ogrenciNo, String ogrenciSinif){
        super (ad,soyAd,tcNo,yas);
this.ogrenciNo= ogrenciNo;
this.ogrenciSinif= ogrenciSinif;
    }

}
