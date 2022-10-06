import java.util.Scanner;

public class SayıTerstenYazdirma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi=scan.nextInt();
        while(sayi>0){
            System.out.print(sayi % 10);
            sayi/=10;

        }
    }
}
