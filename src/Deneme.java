import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = "";
        if (a <= 100 && a >= -100) {
            s = Integer.toString(a);


            if(a==Integer.parseInt(s))
                System.out.println("Good Job");

            //if (s.getClass().getName() != "java.lang.String")
               // System.out.println("Wrong Answer");
        } else System.out.println("Hatalı Giriş");
    }


}








