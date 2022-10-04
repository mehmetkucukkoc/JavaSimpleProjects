package simpleJavaProjects;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bakiyenizi Giriniz : ");
        double bakiye = scan.nextDouble();
        String islemler = "Bakiyenizi Öğrenmek İçin 1'e Basınız.\n"
                + "Para Çekmek İçin 2'ye Basınız.\n"
                + "Para Yatırmak İçin 3'e Basınız.\n"
                + "İşlemi Sonlandırmak İçin 4'e Basınız.";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        while (true) {
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz");
            String islem = scan.nextLine();
            if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("Çekmek İstediğiniz Tutarı Giriniz");
                int tutar = scan.nextInt();
                if (bakiye - tutar < 0) {
                    System.out.println("Bakiyeniz Yetersiz. Lütfen En Fazla " + bakiye + " ₺ Giriniz.");

                }else
                    System.out.println("Kalan Bakiyeniz: "+(bakiye-tutar));

            } else if (islem.equals("3")) {
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz.");
                int yatirilanTutar = scan.nextInt();
                bakiye += yatirilanTutar;
                System.out.println("Toplam Bakiyeniz: " + bakiye);

            } else if (islem.equals("4")) {
                System.out.println("İşleminiz Sonlandırılıyor");
                break;
            } else System.out.println("Geçersiz Bir İşlem Yaptınız.");

        }

    }
}
