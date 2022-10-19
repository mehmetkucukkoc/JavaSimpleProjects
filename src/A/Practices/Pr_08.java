package A.Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pr_08 {
    static ArrayList<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static ArrayList<Double>gunlukKazanclar= new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    static double haftacirosu=0;
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
        int gun=0;
        while(gun<7){
            System.out.println(gunler.get(gun)+" gününün hasılatını giriniz");
            double gunKazancı=sc.nextDouble();
            gunlukKazanclar.add(gunKazancı);
            sc.nextLine();
            haftacirosu+=gunKazancı;
            gun++;
        }
        System.out.println("haftacirosu = " + haftacirosu);
        System.out.println("gunlukKazanclar = " + gunlukKazanclar);
        getOrtalamaKazanc();
        System.out.println("haftanın ortalaması : "+getOrtalamaKazanc());
        getOrtalamaninUstundeKazancGünleri();
        System.out.println("getOrtalamaninUstundeKazancGünleri() = " + getOrtalamaninUstundeKazancGünleri());
        getOrtalamaninAltindaKazancGünleri();
        System.out.println("getOrtalamaninAltindaKazancGünleri() = " + getOrtalamaninAltindaKazancGünleri());
    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalaAltıGun="";
        for(int i=0;i<gunlukKazanclar.size(); i++){
            if(gunlukKazanclar.get(i)<getOrtalamaKazanc()){
                ortalaAltıGun+=gunler.get(i);

            }
        } return ortalaAltıGun;
    }

    private static String getOrtalamaninUstundeKazancGünleri() {
        String ortalaUstuGun="";
        for(int i=0;i<gunlukKazanclar.size(); i++){
            if(gunlukKazanclar.get(i)>getOrtalamaKazanc()){
                ortalaUstuGun+=gunler.get(i);

            }
        }
        return ortalaUstuGun;
    }

    private static double getOrtalamaKazanc() {

        double ortalama =haftacirosu/7;

        return ortalama;
    }
}
