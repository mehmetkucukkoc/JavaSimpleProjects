package HomeWorks.birOn;

import java.util.Scanner;

public class Exceptions01 {
    public static void main(String[] args) {
         /*
        Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını
        kontrol eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
       try{ if(str.length()<6||str.length()>10){
            throw new IllegalArgumentException("Lütfen en az 6 en fazla 10 karakterli bir şifre giriniz");
        }else System.out.println("Şifreniz geçerli : " + str);}
        catch(IllegalArgumentException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
