import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi=scan.nextInt();
        faktoriyel(sayi);
    }

    private static void faktoriyel(int a) {

        int sayi=1;
        sayi*=a;
        a--;
        faktoriyel(sayi);
if(a<1){
    System.out.println("faktoriyel");
}



    }
}
