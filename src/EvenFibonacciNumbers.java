public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int ciftToplam=0;
        int toplam=2;
        int sayi1 = 1;
        int sayi2 = 2;
        for (int i = 1; i <=toplam; i++) {
            sayi1 += sayi2;
            sayi2 += sayi1;
            toplam=sayi1+sayi2;

            if (sayi1 % 2 == 0) {
                ciftToplam += (sayi1);

            }
            if (sayi2 % 2 == 0) {
                ciftToplam += (sayi2);
            }if(toplam>4000000) {
                break;
            }

        }System.out.println(ciftToplam+2);
    }
}
