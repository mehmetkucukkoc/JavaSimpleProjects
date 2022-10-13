package ProjectEulerNet;

public class Problem10_SummationOfPrimes {
    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        long toplam=0l;
        for (long i = 2l; i< 2000000; i++) {
            counter1 = 0;
            for (long j = 1l; j <= i/2; j++) {
                if (i % j == 0) {
                    counter1++;
                }
            }
            if (counter1 == 1) {

                toplam=toplam+i;
                System.out.println(toplam);
            }
        }
    }
}
