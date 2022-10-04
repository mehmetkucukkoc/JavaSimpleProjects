package stringMethods;

import java.util.Scanner;

public class M01_codePointAt {
    public static void main(String[] args) {
        //codePointAt() metodu indexi verilen karakterin asci değerini getirir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen String Bir İfade Giriniz");
        String ifade = scan.nextLine();
        System.out.println("Girdiğiniz İfadede ASCI değerini bulmak istediğiniz Karakterin index değerini giriniz.");
        int index = scan.nextInt();
        System.out.println(ifade.codePointAt(index));

    }
}
