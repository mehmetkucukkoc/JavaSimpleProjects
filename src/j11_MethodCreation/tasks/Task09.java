package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Saat Değeri Giriniz: ");
        int x = scan.nextInt();
        saatCevirici(x);
    }

    public static void saatCevirici(int a) {

        int saniye = a * 60 * 60;
        System.out.println(saniye);



    }
}
