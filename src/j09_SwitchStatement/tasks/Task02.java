package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\nHaftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        System.out.println("Kaç Gün Öncesine Gitmek İstediğinizi Sayı ile Giriniz.");
        int kacGunOnce = scan.nextInt();
        int kalan = kacGunOnce % 7;
        kalan = 7 - kalan;
        int enSonSonuc = kacıncıGun + kalan;
        switch (enSonSonuc) {
            case 1:
                System.out.println(kacGunOnce + " gün önce Pazartesi idi");
                break;
            case 2:
                System.out.println(kacGunOnce + " gün önce Salı idi");
                break;
            case 3:
                System.out.println(kacGunOnce + " gün önce Çarşamba idi");
                break;
            case 4:
                System.out.println(kacGunOnce + " gün önce Perşembe idi");
                break;
            case 5:
                System.out.println(kacGunOnce + " gün önce Cuma idi");
                break;
            case 6:
                System.out.println(kacGunOnce + " gün önce Cumartesi idi");
                break;
            case 7:
                System.out.println(kacGunOnce + " gün önce Pazar idi");
                break;
            case 8:
                System.out.println(kacGunOnce + " gün önce Pazartesi idi");
                break;
            case 9:
                System.out.println(kacGunOnce + " gün önce Salı idi");
                break;
            case 10:
                System.out.println(kacGunOnce + " gün önce Çarşamba idi");
                break;
            case 11:
                System.out.println(kacGunOnce + " gün önce Perşembe idi");
                break;
            case 12:
                System.out.println(kacGunOnce + " gün önce Cuma idi");
                break;
            case 13:
                System.out.println(kacGunOnce + " gün önce Cumartesi idi");
                break;
            case 14:
                System.out.println(kacGunOnce + " gün önce Pazar idi");
                break;
        }


    }
}

