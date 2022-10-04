package j09_SwitchStatement.tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class seyahat {
    public static void main(String[] args) {

        int frankfurtKm = 60;
        int kolnKm = 80;
        int biletFiyatı1 = frankfurtKm / 20 * 5;
        int biletFiyatı2 = kolnKm / 20 * 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye Yolculuk Yapmak İstiyorsunuz");
        String hedef = scan.next().toUpperCase();
        switch (hedef) {
            case "FRANKFURT":
                System.out.println("Rotanız = " + hedef + " Ücret = " + biletFiyatı1);
                break;
            case "KOLN":
                System.out.println("Rotanız = " + hedef + " Ücret = " + biletFiyatı2);

        }
        System.out.println("Kaç Kişilik Bilet İstiyorsunuz? \nMaksimum İki Kişilik Bilet Alabilirsiniz.");
        int biletSayisi = scan.nextInt();
        switch (biletSayisi){
            case 1:
                break;
            case 2:System.out.println("Bilet Ücreti");
        }

    }
}
