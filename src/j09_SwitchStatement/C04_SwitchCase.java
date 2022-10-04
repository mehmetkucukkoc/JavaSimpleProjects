package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
      //girilen ay hangi mevsinde olduğunu print eden kod create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1-12 arasında bir sayı giriniz");
        int ayAdi=input.nextInt();
        switch (ayAdi){
            case 1:
            case 2:
            case 12:
                System.out.println("kıştasınız");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahardasınız");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yazdasınız");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahardasınız");
                break;

            default:
                System.out.println("1-12 arası bir sayı giriniz.");

        }






    }
}
