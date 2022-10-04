package simpleJavaProjects;

import java.util.Scanner;

public class BirinciDereceDenklemCozme {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double a,b,c,x;
        System.out.println("ax+b=c şeklindeki denklemin a değerini giriniz.");
        a=scan.nextDouble();
        System.out.println("ax+b=c şeklindeki denklemin b değerini giriniz.");
        b=scan.nextDouble();
        System.out.println("ax+b=c şeklindeki denklemin c değerini giriniz.");
        c=scan.nextDouble();
        x=(c-b)/a;
        System.out.println("Denklemin Kökü : " +x);

    }
}
