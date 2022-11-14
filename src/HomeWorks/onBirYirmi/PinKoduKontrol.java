package HomeWorks.onBirYirmi;

import java.util.Scanner;

public class PinKoduKontrol {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin="memo12345";
        int girisHakki=4;
        Scanner scan = new Scanner(System.in);

        while(girisHakki!=0){
            System.out.println("Lütfen Pininizi Giriniz");
            String girilenPin= scan.nextLine();
            if(pin==girilenPin){
                System.out.println("Pin doğru Giriş Yaptınız");
            }else System.out.println("Yanlış Pin Girdiniz");
            girisHakki--;
            System.out.println(girisHakki+" hakkınız kaldı");

        }
        System.out.println("Kartınız Bloke Oldu");
    }

}
