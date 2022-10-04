package simpleJavaProjects;

import java.util.Scanner;

public class GirisKontolu {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String kullaniciAd="Mehmet";
        String kullaniciParola="123456";
        int girisSayisi=3;
        System.out.println("Kullanıcı Giriş Paneline Hoşgeldiniz.");
        while(true){
            System.out.println("Adınızı Giriniz");
            String ad=scan.nextLine();
            System.out.println("Parolanızı Giriniz");
            String parola=scan.nextLine();
            if(ad.equals(kullaniciAd)&&parola.equals(kullaniciParola)){
                System.out.println("Sisteme Hoşgeldiniz "+ad);
                break;

            }else if (ad.equals(kullaniciAd)&&!parola.equals(kullaniciParola)){
                System.out.println("Yanlış Parola Girdiniz");
                girisSayisi-=1;
            } else if (!ad.equals(kullaniciAd)&&parola.equals(kullaniciParola)) {
                System.out.println("Yanlış Ad Girdiniz");
                girisSayisi-=1;

            }else {
                System.out.println("Adınızı ve Parolanızı Yanlış Girdiniz.");
            }

            if(girisSayisi==0){

                System.out.println("GİRİŞ HAKKINIZ KALMADI");
                break;
            }

        }





    }
}
