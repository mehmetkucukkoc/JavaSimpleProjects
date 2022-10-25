import java.math.BigInteger;
import java.util.Scanner;

public class Deneme6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger bigInt;
        BigInteger bigInt2;
        String s;
        String s1;
        int multi=1;
        BigInteger sum;
        for (int i=0;i<2;i++) {
            s = scan.nextLine();
            bigInt = new BigInteger(s);

        }for (int i=0;i<2;i++) {
            s1 = scan.nextLine();
            bigInt2 = new BigInteger(s1);

        }
        System.out.println(bigInt.add(bigInt2));

    }
}
