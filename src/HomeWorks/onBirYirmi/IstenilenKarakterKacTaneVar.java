package HomeWorks.onBirYirmi;

import java.util.Scanner;

public class IstenilenKarakterKacTaneVar {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     * ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String cumle=scan.nextLine();
        char harf=scan.next().charAt(0);
        int counter=0;
        for(int i=0;i<cumle.length();i++){
            if(cumle.charAt(i)==harf){
                counter++;
            }
        }
        System.out.println(harf+" harfi "+counter+" kez kullanılmıştır");

    }
}
