package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

      //girilen ay numarasına göre kaç gün çektiğini prpint eden kod yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1-12 arasında bir sayı giriniz");
        int ayAdi=input.nextInt();
        switch (ayAdi){
            case 1:
                System.out.println("Ocak Ayı 31 çeker");
                break;
            case 2:
                System.out.println("Şubat Ayı");
                break;
            case 3:
                System.out.println("Mart Ayı 31 çeker");
                break;
            case 4:
                System.out.println("Nisan Ayı 30 çeker");
                break;
            case 5:
                System.out.println("Mayıs Ayı 31 çeker");
                break;
            case 6:
                System.out.println("Haziran Ayı 30 çeker");
                break;
            case 7:
                System.out.println("Temmuz Ayı 31 çeker");
                break;
            case 8:
                System.out.println("Ağustos Ayı 31 çeker");
                break;
            case 9:
                System.out.println("Eylül Ayı 30 çeker");
                break;
            case 10:
                System.out.println("Ekim Ayı 31 çeker");
                break;
            case 11:
                System.out.println("Kasım Ayı 30 çeker");
                break;
            case 12:
                System.out.println("Aralık Ayı 31 çeker");
                break;
            default:
                System.out.println("1-12 arası bir sayı giriniz.");

        }




















    }
}
