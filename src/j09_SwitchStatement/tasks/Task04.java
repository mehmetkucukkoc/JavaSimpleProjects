package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Kaç Gün Çektiğini Öğrenmek İstediğiniz Adın Ayını Giriniz.");
        String ayAdı = scan.nextLine();
        ayAdı = ayAdı.toUpperCase();
        System.out.println(ayAdı);
        switch (ayAdı) {
            case "OCAK":
            case "MART":
            case "MAYIS":
            case "TEMMUZ":
            case "AĞUSTOS":
            case "EKIM":
            case "ARALIK":
                System.out.println("BU AY 31 ÇEKER");
                break;
            case "NISAN":
            case "HAZIRAN":
            case "EYLÜL":
            case "KASIM":
                System.out.println("BU AY 30 ÇEKER");
            case "ŞUBAT":
                int yil;
                System.out.println("ŞUBAT AYI İÇİN BİR YIL GİRİNİZ");
                yil=scan.nextInt();
                if(yil%4==0){
                    System.out.println("BU AY 29 ÇEKER");

                }else {  System.out.println("BU AY 28 ÇEKER");
                }

        }


    }

}
