package Projects;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Bir İfade Giriniz : ");
        String ifade = sc.nextLine();
        int aSayisi = 0;

        for (int i = 0; i < ifade.length(); i++) {
            if (ifade.charAt(i) == 'a') {
                aSayisi++;


            }
            if (ifade.charAt(i) == 'c') {


                break;
            }

        } System.out.println(aSayisi);


    }


}

