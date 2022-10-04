package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        int currentSpeed = scan.nextInt();

        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        int hizCeza = 0;
        int ehliyetCeza = 0;
        if (currentSpeed <= 0) {
            System.out.println("Lütfen 0'dan büyük bir hız değeri giriniz.");
        } else if (currentSpeed <= 55) {
            System.out.println("Hız Sınırında Gidiyorsunuz.");
        } else if (currentSpeed <= 75) {
            hizCeza = 100;
            System.out.println("Hız Sınırını Aştınız Cezanız : " + hizCeza + " $");
        } else if (currentSpeed <= 85) {
            hizCeza = 150;
            System.out.println("Hız Sınırını Aştınız Cezanız : " + hizCeza + " $");
        } else if (currentSpeed <= 94) {
            hizCeza = 320;
            System.out.println("Hız Sınırını Aştınız Cezanız : " + hizCeza + " $");
        } else if (currentSpeed > 94) {
            hizCeza = 500;
            System.out.println("Hız Sınırını Aştınız Cezanız : " + hizCeza + " $");
        }
        if (isDriverLicenceAvailable) {
            System.out.println("Ehliyetiniz Mevcut");
        } else {
            ehliyetCeza = 200;
            System.out.println("Ehliyetiniz Bulunmamaktadır. Cezanız : " + ehliyetCeza + " $");

        }
        System.out.println("Toplam Cezanız : " + (hizCeza + ehliyetCeza) + " $");


    }
}


