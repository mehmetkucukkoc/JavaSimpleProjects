package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        int y = scan.nextInt();
        artikyil(y);
    }

    private static void artikyil(int a) {

        if (a%4==0){
            System.out.println("Girdiğiniz Yıl Artık Yıldır");

        }else System.out.println("Girdiğiniz Yıl Artık Değildir");


    }
}
