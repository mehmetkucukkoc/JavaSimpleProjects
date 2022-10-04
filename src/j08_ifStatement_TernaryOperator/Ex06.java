package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ekliyetiniz Varsa E Yoksa H yazınız ");
        char ch = sc.next().toUpperCase().charAt(0);
        if (ch == 'E') {
            System.out.println("Lütfen Tecrübe Yılınızı Giriniz. ");
            int tecrube = 0;
            tecrube = sc.nextInt();
            if (tecrube >= 7) {
                System.out.println("Lütfen Mesafe Giriniz. ");
                int mesafe = 0;
                mesafe = sc.nextInt();
                if (mesafe >= 100000) {
                    System.out.println("Kontak Anahtarını Alabilirsiniz. ");

                } else
                    System.out.println("Kontak Anahtarını Alabilmeniz için :  " + (100000 - mesafe) + " mesafe eksikliğiniz var");
            } else
                System.out.println("Kontak Anahtarını Alabilmeniz için :  " + (7 - tecrube) + " Yıl Tecrübe eksikliğiniz var");

        } else if (ch == 'H') {
            System.out.println("Kontak Anahtarını Alamazsınız. ");


        } else System.out.println("Lütfen E veya H Giriniz. ");


    }
}
