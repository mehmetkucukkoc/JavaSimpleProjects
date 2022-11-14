package P04_okulYönetimi.benimProjem;

public class Kisi {
    private String ad;
    private String soyAd;
    private String kimlikNo;
    private int yas;

    public Kisi(String ad, String soyAd, String kimlikNo, int yas) {
        setAd(ad);
        setSoyAd(soyAd);
        setKimlikNo(kimlikNo);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
