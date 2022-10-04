package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /*
        length metodu girilen stringin uzunluğunu:içinde bulunan karakter sayısını return eder.
        bütün karakterleri syıp adedini verir.
         */
        String str ="madem geldin dünyaya otur çalış javaya";
        int strKrktrSayisi=str.length();
        System.out.println(strKrktrSayisi);
        System.out.println(str.length());
        System.out.println(str);
        String str3=null;// rte hatası verir.
        str3.concat(str); // rte hatası verir
//null atanan string metod çalışmaz.
        /*
        null case sensitive bir değerdir yani Null ve NULL yazılamaz
        null bir değer değildir. sadece hiçliği gösteren bir pointer.(işaretçi)
         */
        String name="0";//deklare edilmiş atanmamıs string
        name.concat(str);//atanmamış string metod çalışmaz.









    }
}
