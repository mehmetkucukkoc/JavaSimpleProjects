import java.math.BigInteger;
import java.util.Scanner;

public class Deneme6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger sum;
        BigInteger mult;
        BigInteger bigInt = new BigInteger(scan.next());
        BigInteger bigInt2 = new BigInteger(scan.next());
        sum = bigInt.add(bigInt2);
        mult = bigInt.multiply(bigInt2);
        System.out.println(sum);
        System.out.println(mult);

    }
}
