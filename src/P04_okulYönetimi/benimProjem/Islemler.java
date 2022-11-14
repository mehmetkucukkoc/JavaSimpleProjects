package P04_okulYönetimi.benimProjem;

import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static void girisPaneli() {
        System.out.println(B + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" + W + "\n\t\t\tOGRETMEN-OGRENCI GIRIS PANELI" + Y + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(R + "1-OGRETMEN ISLEMLERI\n2-OGRENCI ISLEMLERI\n0-ÇIKIŞ");
        System.out.println(Y + "LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case 2:
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                girisPaneli();//recursive method call
                break;
        }


    }

    public static void cikis() {
        System.out.println("ÇIKIŞ YAPTINIZ");
    }

    ;

    public static void islemMenusu() {
        System.out.println(kisiTuru + " PANELINE HOŞGELDINIZ");
        System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
        System.out.println("1-EKLEME\n2-ARAMA\n3-LISTELEME\n4-SILME\n0-ANA MENÜ");
        int secilenislem = scan.nextInt();
        switch (secilenislem) {
            case 1:
                kisiEkle();
                islemMenusu();
                break;
            case 2:
                kisiAra();
                islemMenusu();
                break;
            case 3:
                kisiListele();
                islemMenusu();
                break;
            case 4:
                kisiSil();
                islemMenusu();
                break;
            case 0:
                System.out.println("ANA MENÜYE DÖNDÜNÜZ");
                girisPaneli();
                break;
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                islemMenusu();
        }
    }

    static void kisiEkle() {
        System.out.println(kisiTuru + " EKLEME SAYFASINA HOŞGELDİNİZ");
        scan.nextLine();//dummy
        System.out.println("LÜTFEN ADINIZI GİRİNİZ");
        String ad = scan.nextLine().toUpperCase();
        System.out.println("LÜTFEN SOYADINIZI GİRİNİZ");
        String soyAd = scan.nextLine().toUpperCase();
        System.out.println("LÜTFEN T.C. NUMARANIZI GİRİNİZ");
        String tcNo = tcKontrol(scan.nextLine());
        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ");
        int yas = yasKontrol(scan.nextInt());
        if (kisiTuru == "OGRENCI") {
            scan.nextLine();
            System.out.println("LÜTFEN ÖĞRENCİ NO GİRİNİZ");
            String ogrenciNo = scan.nextLine();
            System.out.println("LÜTFEN ÖĞRENCİ SINIF ADI GİRİNİZ");
            String ogrenciSinif = scan.nextLine();
            Ogrenci ogrenci = new Ogrenci(ad, soyAd, tcNo, yas, ogrenciNo, ogrenciSinif);
            Ogrenci.ogrncListesi.add(ogrenci);
        } else {
            System.out.println("SİCİL NO GİRİNİZ");
            scan.nextLine();
            String sicilNo = scan.nextLine();
            System.out.println("BOLUM GİRİNİZ");
            String bolum = scan.nextLine();
            Ogretmen ogretmen = new Ogretmen(ad, soyAd, tcNo, yas, sicilNo, bolum);
            Ogretmen.ogrtListesi.add(ogretmen);

        }


    }


    static void kisiAra() {
        System.out.println(kisiTuru + " ARAMA SAYFASINA HOŞGELDİNİZ");
        boolean flag = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            scan.nextLine();
            System.out.println("LÜTFEN ARAMAK İSTEDİĞİNİZ ÖĞRENCİNİN T.C. NOSUNU GİRİNİZ");
            String arananTC = scan.nextLine();
            for (Kisi k : Ogrenci.ogrncListesi) {
                if (k.getKimlikNo().equals(arananTC)) {
                    System.out.println("ARADIĞINIZ ÖĞRENCİ " + k.getAd() + " " + k.getSoyAd());
                    flag = false;
                }
            }
            if (flag) {
                    System.out.println("ARADIĞINIZ ÖĞRENCİ MEVCUT DEĞİL");
            }

        } else {
            scan.nextLine();
            System.out.println("LÜTFEN ARAMAK İSTEDİĞİNİZ ÖĞRETMENİN T.C. NOSUNU GİRİNİZ");
            String arananTC = scan.nextLine();
            for (Kisi k : Ogretmen.ogrtListesi) {
                if (k.getKimlikNo().equals(arananTC)) {
                    System.out.println(B+"ARADIĞINIZ ÖĞRETMEN " + k.getAd() + " " + k.getSoyAd());
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(B+"ARADIĞINIZ ÖĞRETMEN MEVCUT DEĞİL");
            }

        }
    }

    static void kisiListele() {
        System.out.println(kisiTuru + " LISTELEME SAYFASINA HOŞGELDİNİZ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            for (Kisi k : Ogrenci.ogrncListesi) {
                System.out.println(k.getAd() + " " + k.getSoyAd());
            }
        } else {
            for (Kisi k : Ogretmen.ogrtListesi) {
                System.out.println(k.getAd() + " " + k.getSoyAd());
            }

        }
    }

    static void kisiSil() {
        System.out.println(kisiTuru + " SİLME SAYFASINA HOŞGELDİNİZ");
        boolean flag = true;
        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
            scan.nextLine();
            System.out.println("LÜTFEN SİLMEK İSTEDİĞNİZ ÖĞRENCİNİN T.C. NOSUNU GİRİNİZ");
            String silinecekTC = scan.nextLine();
            for (Kisi k : Ogrenci.ogrncListesi) {
                if (k.getKimlikNo().equals(silinecekTC)) {
                    Ogrenci.ogrncListesi.remove(k);
                    System.out.println(k.getAd() + " " + k.getSoyAd() + " KİŞİSİ SİLİNDİ");
                    flag =false;
                    break;
                } if(flag) {
                    System.out.println("BU T.C. NOLU BİR KAYIT YOKTUR");
                }
            }
        } else {
            System.out.println("LÜTFEN SİLMEK İSTEDİĞNİZ ÖĞRETMENİN T.C. NOSUNU GİRİNİZ");
            scan.nextLine();
            String silinecekTC = scan.nextLine();

            for (Kisi k : Ogretmen.ogrtListesi) {
                if (k.getKimlikNo().equals(silinecekTC)) {
                    Ogretmen.ogrtListesi.remove(k);
                    System.out.println(k.getAd() + " " + k.getSoyAd() + " KİŞİSİ SİLİNDİ");
                } else {
                    System.out.println("BU T.C. NOLU BİR KAYIT YOKTUR");
                }
            }
        }
    }

    static String tcKontrol(String tcNo) {
        int[] sayiDizi = new int[11];
        if (tcNo == null || tcNo.length() != 11) {
            System.out.println("LÜTFEN 11 HANELİ BİR T.C. NO GİRİNİZ");
            tcKontrol(scan.nextLine());
        } else {
            for (int i = 0; i < 11; i++) {
                sayiDizi[i] = Integer.parseInt(tcNo.substring(i, (i + 1)));
            }
            if (sayiDizi != null) {
                //t.c. no koşulları
                //İlk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
                //1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı vermektedir.
                //1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
                boolean kosul1 = (sayiDizi[0] + sayiDizi[1] + sayiDizi[2] + sayiDizi[3] + sayiDizi[4] + sayiDizi[5] + sayiDizi[6] + sayiDizi[7] + sayiDizi[8] + sayiDizi[9]) % 10 == sayiDizi[10];
                boolean kosul2 = (((sayiDizi[0] + sayiDizi[2] + sayiDizi[4] + sayiDizi[6] + sayiDizi[8]) * 7) + ((sayiDizi[1] + sayiDizi[3] + sayiDizi[5] + sayiDizi[7]) * 9)) % 10 == sayiDizi[9];
                boolean kosul3 = ((sayiDizi[0] + sayiDizi[2] + sayiDizi[4] + sayiDizi[6] + sayiDizi[8]) * 8) % 10 == sayiDizi[10];
                if (kosul1 && kosul2 && kosul3) {

                    tcNo = String.valueOf(tcNo);

                } else {
                    System.out.println("LÜTFEN GEÇERLİ BİR T.C. KİMLİK NO GİRİNİZ.");

                    tcKontrol(scan.nextLine());
                }

            }

        }
        return tcNo;
    }

    private static int yasKontrol(int yas) {
        if (yas < 0 || yas > 100) {
            System.out.println("LÜTFEN 0 İLE 100 ARASINDA BİR YAŞ GİRİNİZ");
            yasKontrol(scan.nextInt());
        } else {
            yas = yas;
        }
        return yas;
    }
}
