package simpleJavaProjects;

import java.util.Scanner;

public class CumleyiTerstenYazma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Tersten Yazılmasını İstediğiniz Kelimeyi Yazınız.");
        String cumle=scan.nextLine();
        for(int i=cumle.length()-1;i>=0;i--){
            System.out.print(cumle.charAt(i));
        }
    }



}
