package A.Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr_14 {
    static Scanner sc = new Scanner(System.in);
    static List<Integer>sayiList=new ArrayList<>();

    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

ortalamadanBuyukOlanıBul();
    }

    private static void ortalamadanBuyukOlanıBul() {
        double ortalama=0;

        for(int i=0;i<= sayiList.size(); i++){
            System.out.println((i+1)+".Sayıyı Giriniz. Sonlandırmak İçin 4 kez 0000 Basınız.");
            int sayi= sc.nextInt();
            if (sayi==0000){
                System.out.println("İşlemi Sonlandırdınız");
                break;
            }
            sayiList.add(sayi);

            ortalama+=sayiList.get(i);

        }
        System.out.println("Sayı Listeniz : "+sayiList);
        System.out.println("ortalama = " + ortalama/ sayiList.size());
        for(int j=0;j< sayiList.size(); j++){
            if(sayiList.get(j)>ortalama/ sayiList.size()) System.out.println(sayiList.get(j));

        }
        }

    }



