package ProjectEulerNet;

public class Problem7_10001stPrime {
    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        for (long i = 2l; i< 1000000000; i++) {
            counter1 = 0;
            for (long j = 1l; j <= i; j++) {
                if (i % j == 0) {
                    counter1++;
                }
            }
            if (counter1 == 2) {
                counter2++;
                if(counter2==10001){
                    System.out.println(i);
                }
            }
        }
    }
}
