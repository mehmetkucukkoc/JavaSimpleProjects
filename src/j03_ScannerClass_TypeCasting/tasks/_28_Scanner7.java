package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner scan = new Scanner(System.in);
        boolean b=scan.nextBoolean();
        if (b == true) {
            System.out.println("Bir Banka Hesabınız Var");
        } else if (b == false) {
            System.out.println("Bir Banka Hesabınız Yok");
        }
        scan.close();


    }
}
