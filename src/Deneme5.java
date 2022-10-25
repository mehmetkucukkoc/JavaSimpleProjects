import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Deneme5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        System.out.println(n);

        BigInteger bigInt = new BigInteger(n);
        boolean isPrime = bigInt.isProbablePrime(1);
        if (isPrime == true) {
            System.out.println("prime");
        } else System.out.println("not prime");
    }
}
