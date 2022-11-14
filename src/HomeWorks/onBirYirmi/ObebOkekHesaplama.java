package HomeWorks.onBirYirmi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ObebOkekHesaplama {
    public static void main(String[] args) {
         /*
TASK => Girilen iki sayının EBOB ve EKOK larını print eden method yazınız.
Ekok(a,b)= |a*b|/ebob(a.b)
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci sayıyı Giriniz");
        int sayi2 = scan.nextInt();
      try{  System.out.println(sayi1+" ve "+sayi2+" EBOB değeri : "+ebobHesapla(sayi1, sayi2));
        System.out.println(sayi1+" ve "+sayi2+" EKOK değeri : "+ekokHesaplama(sayi1, sayi2,ebobHesapla(sayi1,sayi2)));

    }catch(IndexOutOfBoundsException e){//sayılardan birini -eksi girince hata verdi
          System.out.println("Negatif Index Olmaz");
      }
    }
static int ekokHesaplama(int sayi1,int sayi2,int ebobHesapla){

        return sayi1*sayi2/ebobHesapla;
}
    static int ebobHesapla(int sayi1,int sayi2){
        List <Integer> liste= new ArrayList();
        for(int i=1;i<=Math.max(sayi1,sayi2);i++){
            for(int j=1;j<=Math.min(sayi1,sayi2);j++){
                if(sayi1%i==0&&sayi2%j==0){
                    if(i==j){
                      liste.add(i);
                    }
                }

            }
        }

        Collections.sort(liste);

        return liste.get(liste.size()-1);
    }
}
