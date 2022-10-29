import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < 100; i++) {
            if (s.hasNext() == true) {
                String str = s.nextLine();
                System.out.println(count + " " + str);
                count++;

            }

        }
    }
}
