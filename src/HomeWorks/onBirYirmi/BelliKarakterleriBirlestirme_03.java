package HomeWorks.onBirYirmi;

import java.util.Scanner;

public class BelliKarakterleriBirlestirme_03 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str = scanner.nextLine();
        System.out.print("bir sayi giriniz :");
        int sayi = scanner.nextInt();
stringMerge(str,sayi);
    }
   static void stringMerge(String str,int sayi){
        String mergedStr=str.substring(0,1)+str.substring(str.length()-1);
        for(int i=1;i<=sayi;i++){
            System.out.print(mergedStr);
        }
    }
}
