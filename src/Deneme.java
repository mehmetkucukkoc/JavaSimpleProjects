import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       // BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 6; t++) {
            //String inputN = bufferRead.readLine();
            String inputN = scan.next();
            try {
                long n = Long.valueOf(inputN);
                System.out.println(n + " can be fitted in:");
                if (0 <= n && n <= 1) {
                    System.out.println("* boolean");
                }
                if (Byte.MIN_VALUE <= n && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (Short.MIN_VALUE <= n && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (Long.MIN_VALUE <= n && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception ex) {
                System.out.println(inputN + " can't be fitted anywhere.");
            }
        }
    }
}
