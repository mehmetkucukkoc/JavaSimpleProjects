import java.util.Scanner;

public class KelimeOyunu {
    public static void main(String[] args) {


        kelime();
    }


    public static void kelime() {
        Scanner scan = new Scanner(System.in);
        int birinciOyuncuPuan = 0;
        System.out.println("1. Oyuncu Lütfen Bir Kelime Giriniz");
        String kelime1 = scan.nextLine();
        char oyunaDevam = 'a';
        System.out.println("Girilen Kelime : " + kelime1);
        System.out.println("2. Oyuncu 1. Oyuncunun Kelimesini \nKabul Ediyorsan 1'e \nKabul Etmiyorsan 2'ye Bas.");
        int ikinciOyuncuTercih = scan.nextInt();
        if (ikinciOyuncuTercih == 1) {
            birinciOyuncuPuan += kelime1.length();
            System.out.println("Puanınız : " + birinciOyuncuPuan);
        } else if (ikinciOyuncuTercih == 2) {
            System.out.println("Geçersiz Kelime Girdiniz \n1. Oyuncu Kazandı");
            System.out.println("Oyuna Devam İstiyorsanız D'ye \nOyundan Çıkmak İstiyorsanız Ç'ye Basınız.");
            oyunaDevam = scan.next().toUpperCase().charAt(0);
            if (oyunaDevam == 'D')

                kelime();
            else System.out.println("Çıkış Yaptınız");
        }


    }
}
