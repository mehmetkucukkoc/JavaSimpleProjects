package j11_MethodCreation;


import java.util.Scanner;

public class C02_MethodCreation {


    public static double nothesaplama(double a, double b, double c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.notu gir");
        a = sc.nextDouble();
        System.out.println("2.notu gir");
        b = sc.nextDouble();
        System.out.println("3.notu gir");
        c = sc.nextDouble();
        return (a+b+c)/3;


    }

    public static void main(String[] args) {
System.out.println(nothesaplama(12,23,34));
    }
}
