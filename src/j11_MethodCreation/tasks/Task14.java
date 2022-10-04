package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İşe Başlama Saatinizi Giriniz.");
        double iseBaslamaSaati = scan.nextDouble();
        System.out.println("Lütfen İşten Çıkış Saatinizi Giriniz.");
        double istenCikisSaati = scan.nextDouble();
        System.out.println("Lütfen Mesainizin Saatlik Ücretii Giriniz.");
        double mesaiSaatlikUcret = scan.nextDouble();
        System.out.println("Lütfen Fazla Mesai Katsayısını Giriniz.");
        double fazlaMesaiKatsayi = scan.nextDouble();


        double ucret=ucretHesapla(iseBaslamaSaati, istenCikisSaati, mesaiSaatlikUcret, fazlaMesaiKatsayi);
        System.out.println(ucret);


    }

    public static double ucretHesapla(double iseBaslamaSaati, double istenCikisSaati, double mesaiSaatlikUcret, double fazlaMesaiKatsayi) {
double toplamUcret=0;
        if (iseBaslamaSaati < istenCikisSaati && istenCikisSaati <= 24) {
            if (istenCikisSaati <= 17) {
                System.out.println("Alacağınız Ücret : " + (toplamUcret = (istenCikisSaati - iseBaslamaSaati) * mesaiSaatlikUcret));

            } else
                System.out.println("Alacağınız Ücret : " + (toplamUcret = ((17 - iseBaslamaSaati)*40)+ ((istenCikisSaati-17)*mesaiSaatlikUcret*fazlaMesaiKatsayi)));

        }else System.out.println("Lütfen Geçerli Bir Sayı Giriniz");

        return toplamUcret;
    }
}
