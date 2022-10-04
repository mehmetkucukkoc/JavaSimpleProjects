package stringMethods;

import java.util.Scanner;

public class M02_codePointBefore {
    public static void main(String[] args) {
        //codePointBefore() metodu indexi 1'den başlatarak verilen karakterin asci değerini getirir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen String Bir İfade Giriniz");
        String ifade = scan.nextLine();
        System.out.println("Girdiğiniz İfadede ASCI değerini bulmak istediğiniz Karakterin index değerini giriniz.");
        int index = scan.nextInt();
        System.out.println(ifade.codePointBefore(index));

    }
}
