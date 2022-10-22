import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        for (int i = 1; i < 6; i++) {
            String str = scan.next();


            try {

                long input2 = Long.valueOf(str);
                if (input2 > Integer.MAX_VALUE || input2 < Integer.MIN_VALUE)
                    System.out.println(input2 + " can be fitted in:\n* long");
              else  if (input2 > Short.MAX_VALUE || input2 < Short.MIN_VALUE)
                    System.out.println(input2 + " can be fitted in:\n* int\n* long");
               else if (input2 > Byte.MAX_VALUE || input2 < Byte.MIN_VALUE)
                    System.out.println(input2 + " can be fitted in:\n* short\n* int \n* long");
                if (input2 >= Byte.MIN_VALUE && input2 <= Byte.MAX_VALUE)
                    System.out.println(input2 + " can be fitted in:\n* byte\n* short \n* int\n* long");


            } catch (Exception e) {
                System.out.println(str + " can't be fitted anywhere.");
            }

        }
    }
}
