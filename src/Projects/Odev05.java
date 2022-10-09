package Projects;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean ucunUssuMu;
        int counter=0;
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi = scan.nextInt();
        for (int i =sayi;i>0; i--){
            if(sayi%3==0){
                sayi/=3;
                counter++;
            }
            else if(sayi%3!=0) System.out.println(ucunUssuMu = false);

            break;
        } System.out.println("Girdiğiniz Sayı 3'ün "+counter+". Kuvvetidir.");


    }


}

