package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Kelime Giriniz");
        String kelime=scan.nextLine();
        int length=kelime.length();
        String tersKelime="";
        for(int i=length-1;i>=0;i--) {
            tersKelime+=kelime.charAt(i);

        }
        if(tersKelime.equals(kelime)){
            System.out.println(kelime+" palindromdur");
        }else   System.out.println(kelime+" palindrom değildir");

    }
}
